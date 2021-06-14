package com.veera.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veera.bo.PatientBO;
import com.veera.dao.IPatientDAO;
import com.veera.dto.PatientDTO;

@Service("patService")
public class PatientMgmtServiceImpl implements IPatientMgmtService {

	@Autowired
	private IPatientDAO  dao;

	@Override
	public List<PatientDTO> fetchPatientsByHplNames(String[] desgs) throws Exception {
		  StringBuilder  buffer=new StringBuilder("(");
		 for(int i=0;i<desgs.length;++i) {
			 if(i==desgs.length-1) 
				 buffer.append("'"+desgs[i]+"')");
			 else
				 buffer.append("'"+desgs[i]+"',");  
		 }
		 String cond=buffer.toString();
		  //use DAO
		   List<PatientBO> listBO=dao.getPatientsByHpl(cond);
		   //convert ListBO to ListDTO
		   List<PatientDTO> listDTO=new ArrayList();
		   listBO.forEach(bo->{
			   PatientDTO dto=new PatientDTO();
			  
			   BeanUtils.copyProperties(bo,dto); // property names and type must match in both java beans
			   dto.setSrNo(listDTO.size()+1);
			   //add each obj of DTO class to ListDTO
			   listDTO.add(dto);
		   });

		return listDTO;
	}
}
