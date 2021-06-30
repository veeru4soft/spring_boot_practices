package com.veera.service;

import java.util.List;

import com.veera.dto.EmployeeDTO;

public interface IEmployeeService {
	public List<EmployeeDTO>  fetchEmpsByDesgs(String desgs[])throws Exception;
}
