package com.veera;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.veera.beans.WishMessageGenerator;

@SpringBootApplication
public class SpringBootFirstAppApplication {
	
	@Bean("ldt")
	public LocalDateTime createLocalDate() {
		System.out.println("LocalDateTime.createLocalDate()");
		LocalDateTime ldt = LocalDateTime.now();
		return ldt;
	}

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx = SpringApplication.run(SpringBootFirstAppApplication.class, args);
		// get Target spring Bean class from IOC container
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		// invoke methods
		String result = generator.generateWishMessage("Suresh");
		System.out.println(result);
		// close containers
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
