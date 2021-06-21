package com.veera.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("info")
@PropertySource("com/veera/commons/inputs.properties")
public class ItemsInfo {
	@Value("${biryani.price1}")
	public float biryaniPrice;
	@Value("${pulav.price}")
	public float pulavPrice;
	@Value("${meals.price}")
	public float mealsPrice;
	
	@Override
	public String toString() {
		return "ItemsInfo [biryaniPrice=" + biryaniPrice + ", pulavPrice=" + pulavPrice + ", mealsPrice=" + mealsPrice
				+ "]";
	}
	
	
}
