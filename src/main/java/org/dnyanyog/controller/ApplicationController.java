package org.dnyanyog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	@GetMapping("/hello")
	public String hello() {
		return "Hellow";
	}
	
	@GetMapping("/challo")
	public String Challo() {
		long date=System.currentTimeMillis();
		return "Hi there ,chalo chalo"+date;
	}

}
