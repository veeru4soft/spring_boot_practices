package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.veera.models.Employee;

@SpringBootApplication
public class Boot08WorkingWithYmlFileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Boot08WorkingWithYmlFileApplication.class, args);
		Employee emp = ctx.getBean("emp", Employee.class);
		System.out.println(emp);
		((ConfigurableApplicationContext) ctx).close();
	}

}
