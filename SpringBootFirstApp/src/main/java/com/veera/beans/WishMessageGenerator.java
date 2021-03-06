package com.veera.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime date;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-arg constructro");
	}
	
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage(-)");
		int hour = date.getHour();
		if(hour < 12 ) {
			return "Good Morning " + user;
		}
		else if(hour < 16) {
			return "Good Afternoon " + user;
		}
		else if(hour < 20) {
			return "Good Evening " + user;
		}
		else
			return "Good Night "+ user;
	}

}
