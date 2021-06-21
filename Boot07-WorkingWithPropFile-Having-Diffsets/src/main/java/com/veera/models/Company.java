package com.veera.models;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("comp")
public class Company {
	private String name;
	private String location;
	private int size;
}
