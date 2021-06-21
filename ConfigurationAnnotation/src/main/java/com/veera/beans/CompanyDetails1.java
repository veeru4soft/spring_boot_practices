package com.veera.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("company1")
public class CompanyDetails1 {
	@Value("${org.veera.name}")
	private  String  title;
	@Value("${org.veera.type}")
	private String  type;
	@Value("${org.veera.location}")
	private String addrs;
	@Override
	public String toString() {
		return "CompanyDetails1 [title=" + title + ", type=" + type + ", addrs=" + addrs + "]";
	}
	
	
}
