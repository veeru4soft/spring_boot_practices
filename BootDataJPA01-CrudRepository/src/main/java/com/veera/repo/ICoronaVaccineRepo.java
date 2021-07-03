package com.veera.repo;

import org.springframework.data.repository.CrudRepository;

import com.veera.entity.CoronaVaccine;

public interface ICoronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {

}
