package com.veera.beans;

import org.springframework.stereotype.Component;

@Component("UI")
public class UICourseMaterial implements ICourseMaterial{
	
	public UICourseMaterial() {
		System.out.println("UICourseMaterial 0-arg constructor");
	}

	@Override
	public String courseContent() {
		System.out.println("UICourseMaterial.courseContent()");
		return "1. css, 2. HTML, 3. javascript, 4. jquery";
	}

	@Override
	public double coursePrice() {
		System.out.println("UICourseMaterial.courseContent()");
		return 200;
	}

}
