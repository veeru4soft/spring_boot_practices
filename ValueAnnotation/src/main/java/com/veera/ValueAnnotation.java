package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.veera.beans.BillGenerator;

@SpringBootApplication
public class ValueAnnotation {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ValueAnnotation.class, args);
		BillGenerator generator=ctx.getBean("bill",BillGenerator.class);
		System.out.println("data ::"+generator);
		((ConfigurableApplicationContext) ctx).close();
	}

}
