package com.veera.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoronaVaccine implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long regNo;
	@Column(length=20)
	private String name;
	@Column(length=20)
	private String company;
	@Column(length=20)
	private String country;
	private Double price;
	private Integer requiredDosesCount;
}
