package com.veera.service;

import com.veera.entity.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public String registerVaccine(CoronaVaccine vaccine);
	public Iterable  registerInBatch(Iterable<CoronaVaccine> vaccines);
	public    long    getVaccinesCount();
    public  boolean   checkVaccineAvailabilityByRegNo(long regNo);

}
