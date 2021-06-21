package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.veera.beans.CompanyDetails;
import com.veera.beans.CompanyDetails1;

@SpringBootApplication
public class ConfigurationAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ConfigurationAnnotationApplication.class, args);
		CompanyDetails  company1=ctx.getBean("company",CompanyDetails.class);
		System.out.println(company1);
		System.out.println("------------------------------");
		CompanyDetails1  company2=ctx.getBean("company1",CompanyDetails1.class);
		System.out.println(company2);
		((ConfigurableApplicationContext) ctx).close();
	}

}
