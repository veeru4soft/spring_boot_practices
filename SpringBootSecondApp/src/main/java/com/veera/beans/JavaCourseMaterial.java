package com.veera.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterial implements ICourseMaterial {
	
	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial - 0 arg constructor");
	}

	@Override
	public String courseContent() {
		System.out.println("JavaCourseMaterial.courseContent()");
		return "1.oops, 2.Inheritance, 3. Polymorphism, 4. Swing";
	}

	@Override
	public double coursePrice() {
		System.out.println("JavaCourseMaterial.coursePrice()");
		return 400;
	}

}
