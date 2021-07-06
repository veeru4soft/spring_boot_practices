package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.veera.entity.CoronaVaccine;
import com.veera.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class BootDataJpa01CrudRepositoryApplication {

	public static void main(String[] args) {
		// get access to IOC containers
		SpringApplication.run(BootDataJpa01CrudRepositoryApplication.class, args);
	}
}
