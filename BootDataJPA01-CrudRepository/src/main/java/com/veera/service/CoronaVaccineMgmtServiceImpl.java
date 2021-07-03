package com.veera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veera.entity.CoronaVaccine;
import com.veera.repo.ICoronaVaccineRepo;

@Service("vaccineMgmtService")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {
	@Autowired
	private ICoronaVaccineRepo coronarepo;
	
	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		System.out.println("In Memory Proxy class name:"+coronarepo.getClass());
		CoronaVaccine savedVaccine = null;
		if(vaccine!=null)
			savedVaccine = coronarepo.save(vaccine);
		return savedVaccine != null ? "Vacccine registered/updated successfully with"+savedVaccine.getRegNo() : "Vaccine registration/updated failed";
	}

}
