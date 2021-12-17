package com.ticket.railway.service;



import java.io.IOException;

import com.ticket.railway.user.UserData;



public interface ticketService {
	//public String generatePNR();

	String generatePNR(UserData userdata) throws IOException;
}
