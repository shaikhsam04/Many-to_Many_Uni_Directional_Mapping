package com.jsp.controller;

import com.jsp.service.CabService;
import com.jsp.service.PersonService;

public class UpdateController {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		personService.updatePerson(1, "ramesh", "ramesh@gamil.com", 985669565);

		CabService cabService = new CabService();
		cabService.updateCab(1, "kk menon Cab", "A.C");
	}
}
