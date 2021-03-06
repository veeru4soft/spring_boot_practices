package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.veera.beans.Student;

@SpringBootApplication
public class SpringBootSecondAppApplication {

	public static void main(String[] args) {
		 // get IOC Container
		 ApplicationContext ctx = SpringApplication.run(SpringBootSecondAppApplication.class, args);
		 // get Target java bean class object
		 Student st = ctx.getBean("stud", Student.class);
		 // invoke business method
		 st.preparation("ValueLabs Interview");
		 // close container
		 ((ConfigurableApplicationContext) ctx).close();
	}

}
