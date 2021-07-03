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
		ApplicationContext ctx = SpringApplication.run(BootDataJpa01CrudRepositoryApplication.class, args);
		// get service class obj
		ICoronaVaccineMgmtService service = ctx.getBean("vaccineMgmtService", ICoronaVaccineMgmtService.class);
		//invoke methods
		try {
			//create entity object
			CoronaVaccine vaccine = new CoronaVaccine(null, "SputhnikV", "Some Russian", "Russia", 1650.0, 2);
			//call b.method
			System.out.println(service.registerVaccine(vaccine));
			
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		//closing the context obj
		((ConfigurableApplicationContext) ctx).close();
	}
}
