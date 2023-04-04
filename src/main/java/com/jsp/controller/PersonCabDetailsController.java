package com.jsp.controller;

import com.jsp.service.CabService;
import com.jsp.service.PersonService;

public class PersonCabDetailsController {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		personService.getPersonById(1);

		CabService cabService = new CabService();
		cabService.getCabById(1);

	}
}
