package com.veera;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.veera.controller.MainController;
import com.veera.vo.PatientVO;

@SpringBootApplication
public class AssignmentPatientApplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Hospital Names count::");
		int count=sc.nextInt();
		String hplnames[]=null;
		if(count>=1)
		    hplnames=new String[count];
		else {
			System.out.println("invalid Hospital Names count ");
			return;
		}
		for(int i=0;i<count;++i) {
			System.out.println("enter hospital name"+(i+1));
			String hplname=sc.next();
			hplnames[i]=hplname;
		}
		
			     		
		ApplicationContext ctx = SpringApplication.run(AssignmentPatientApplication.class, args);
		MainController controller=ctx.getBean("controller",MainController.class);
		try {
			List<PatientVO> listVO=controller.showPatientsByHplNames(hplnames);
			System.out.println("Patients details are in  "+Arrays.toString(hplnames));
			listVO.forEach(vo->{
				System.out.println(vo);
			});
		}//try
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Some Internal problem::"+e.getMessage());
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
