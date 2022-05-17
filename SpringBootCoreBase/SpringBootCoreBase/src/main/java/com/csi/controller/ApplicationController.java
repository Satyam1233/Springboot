package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApplicationController {

	@GetMapping
	public String sayHello() {
		return "WELCOME TO CSI PUNE";
	}

	@GetMapping("/service")
	public String sayService() {
		return "SOFTWARE DEVELOPMENT";
	}

	@GetMapping("/address")
	public String sayAddress() {
		return "PUNE || INDIA ";
	}

	@GetMapping("/fees")
	public int sayFees() {
		return 118000;
	}

}
