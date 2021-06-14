package com.veera.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.veera.bo.PatientBO;

public class PatientDAOImpl implements IPatientDAO {
	
	private static final String GET_PATIENT_BY_HPL_NAME="SELECT PATNO, PNAME, HPLNAME, AGE, HPLNO, DIEASE FROM PATIENTS  WHERE HPLNAME IN";
	
	@Autowired
	private  DataSource  ds;

	@Override
	public List<PatientBO> getPatientsByHpl(String cond) throws Exception {
		List<PatientBO> listBO=null;
		try(  //get pooled jdbc con   
			Connection con=ds.getConnection();
			Statement st=con.createStatement(); 
			// select patno, pname, age, diease, hplno, hplname, from patients where hplname in('CARE','KIMS', 'PRIME') order by hplname
			 ResultSet rs=st.executeQuery(GET_PATIENT_BY_HPL_NAME+cond+" ORDER BY HPLNAME");
			){
			 //convert RS object records to List of BO class objs
			 listBO=new ArrayList();
			 PatientBO bo=null;
			 while(rs.next()) {
				 //copy each record of RS to a object of PatientBO class
				 bo=new PatientBO();
				 bo.setPatientNo(rs.getInt(1));
				 bo.setPatientName(rs.getString(2));
				 bo.setAge(rs.getInt(3));
				 bo.setDiease(rs.getString(4));
				 bo.setHplNo(rs.getInt(5));
				 bo.setHplName(rs.getString(6));
				 //add each object of PatientBO to  List Collection
				 listBO.add(bo);
			 }//while
		}//try   
		catch(SQLException se) {
			se.printStackTrace();
			throw se;  //for Exception  propagation
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return listBO;
		
	}

}
