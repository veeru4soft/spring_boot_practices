package com.veera.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.veera.dto.PatientDTO;
import com.veera.service.IPatientMgmtService;
import com.veera.vo.PatientVO;

@Controller("controller")
public class MainController {
	@Autowired
	private IPatientMgmtService service;
	
	public List<PatientVO> showPatientsByHplNames(String hplnames[])throws Exception{
		//use service
		List<PatientDTO> listDTO=service.fetchPatientsByHplNames(hplnames);
		//convert listDTO to listVO
		List<PatientVO> listVO=new ArrayList();
		listDTO.forEach(dto->{
			PatientVO vo=new PatientVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSrNo(String.valueOf(dto.getSrNo()));
			vo.setPatientNo(String.valueOf(dto.getPatientNo()));
			vo.setAge(String.valueOf(dto.getAge()));
			vo.setHplNo(String.valueOf(dto.getHplNo()));
			listVO.add(vo);
		});
		return listVO;
	}//method

}
