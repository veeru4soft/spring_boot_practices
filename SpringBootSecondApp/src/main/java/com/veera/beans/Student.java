package com.veera.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stud")
public final class Student {
	@Autowired
	private ICourseMaterial material;
	
	public void preparation(String examName) {
		System.out.println("Student.preparation(-)");
		String courseContent = material.courseContent();
		System.out.println("preparation for "+ examName + " and the course content is "+ courseContent);
		double price = material.coursePrice();
		System.out.println("Course Fee is "+ price);
	}
}
