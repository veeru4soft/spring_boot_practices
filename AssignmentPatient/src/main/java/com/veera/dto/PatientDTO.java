package com.veera.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PatientDTO implements  Serializable {
	private Integer srNo;
	private Integer patientNo;
	private String patientName;
	private Integer age;
	private String diease;
	private Integer hplNo;
	private String hplName;

}
