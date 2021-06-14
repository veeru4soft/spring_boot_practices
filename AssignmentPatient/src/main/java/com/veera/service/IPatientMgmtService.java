package com.veera.service;

import java.util.List;

import com.veera.dto.PatientDTO;

public interface IPatientMgmtService {
	public List<PatientDTO>  fetchPatientsByHplNames(String hplnames[])throws Exception;
}
