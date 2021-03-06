package com.veera.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ruby")
@Primary
public class RubyCourseMaterial implements ICourseMaterial{
	
	public RubyCourseMaterial() {
		System.out.println("RubyCourseMaterial 0 - arg constructor");
	}

	@Override
	public String courseContent() {
		System.out.println("RubyCourseMaterial.courseContent()");
		return "1. ruby basics, 2. ruby syntaxes, 3. ruby oops, 4. ruby hashes";
	}

	@Override
	public double coursePrice() {
		System.out.println("RubyCourseMaterial.courseContent()");
		return 500;
	}

}
