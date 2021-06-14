package com.veera.bo;

import lombok.Data;

@Data
public class PatientBO {
	private Integer patientNo;
    private String patientName;
    private Integer age;
    private String diease;
    private Integer hplNo;
    private String hplName;
}
