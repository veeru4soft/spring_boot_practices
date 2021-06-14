package com.veera.dao;

import java.util.List;

import com.veera.bo.PatientBO;

public interface IPatientDAO {
	public  List<PatientBO>  getPatientsByHpl(String cond)throws Exception;

}