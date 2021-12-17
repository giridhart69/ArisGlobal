package com.ticket.railway.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.railway.service.ticketService;
import com.ticket.railway.user.UserData;

@RestController
public class mainController {

	@Autowired
	private ticketService ticketservice;
	
	@RequestMapping("/")
	public String hello() {
		return "hELLO wORLD";
	}
	
	@PostMapping("/api")
	public String create(@RequestBody UserData userdata) throws IOException {
		return ticketservice.generatePNR(userdata);
	}

	public mainController(ticketService ticketservice) {
		super();
		this.ticketservice = ticketservice;
	}	
}