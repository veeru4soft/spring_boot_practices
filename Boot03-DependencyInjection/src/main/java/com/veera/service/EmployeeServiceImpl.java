package com.veera.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veera.bo.EmployeeBO;
import com.veera.dao.IEmployeeDAO;
import com.veera.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO  dao;

	@Override
	public List<EmployeeDTO> fetchEmpsByDesgs(String[] desgs) throws Exception {
		 //convert desgs[] into  SQL  IN caluse String condition  ('CLERK','MANAGER','SALESMAN')
		 //StringBuffer buffer=new StringBuffer("(");
		  StringBuilder  buffer=new StringBuilder("(");
		 for(int i=0;i<desgs.length;++i) {
			 if(i==desgs.length-1)  //for the last element of the arary
				 buffer.append("'"+desgs[i]+"')");
			 else
				 buffer.append("'"+desgs[i]+"',");  //for other than last element
		 }//for
		 //convert StringBuffer/StringBuidler object into String
		 String cond=buffer.toString();
		  //use DAO
		   List<EmployeeBO> listBO=dao.getEmpsByDesg(cond);
		   //convert ListBO to ListDTO
		   List<EmployeeDTO> listDTO=new ArrayList();
		   listBO.forEach(bo->{
			   EmployeeDTO dto=new EmployeeDTO();
			   //copy  each BO class obj to each DTO class obj 
			   BeanUtils.copyProperties(bo,dto); // property names and type must match in both java beans
			   dto.setSrNo(listDTO.size()+1);
			   //add each obj of DTO class to ListDTO
			   listDTO.add(dto);
		   });

		return listDTO;
	}//for

}//class
