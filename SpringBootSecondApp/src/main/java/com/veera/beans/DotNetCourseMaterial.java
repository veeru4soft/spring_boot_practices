package com.veera.beans;

import org.springframework.stereotype.Component;

@Component("dotNet")
public class DotNetCourseMaterial implements ICourseMaterial {
	
	public DotNetCourseMaterial() {
		System.out.println("DotNetCourseMaterial 0-arg constructor");
	}

	@Override
	public String courseContent() {
		System.out.println("DotNetCourseMaterial.courseContent()");
		return "1. c# oops, 2. c# basics, 3. c# inheritance, 4. c# exception handling";
	}

	@Override
	public double coursePrice() {
		System.out.println("DotNetCourseMaterial.courseContent()");
		return 300;
	}

}
