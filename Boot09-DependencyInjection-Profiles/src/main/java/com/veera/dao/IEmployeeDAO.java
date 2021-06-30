package com.veera.dao;

import java.util.List;

import com.veera.bo.EmployeeBO;

public interface IEmployeeDAO {
	 public  List<EmployeeBO>  getEmpsByDesg(String cond)throws Exception;
}
