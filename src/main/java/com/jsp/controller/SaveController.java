package com.jsp.controller;

import com.jsp.dto.Cab;
import com.jsp.dto.Person;
import com.jsp.service.CabService;
import com.jsp.service.PersonService;

public class SaveController {
	public static void main(String[] args) {

		PersonService personService = new PersonService();
		CabService cabService = new CabService();

		Person person = new Person();
		person.setName("sameer");
		person.setEmail("sam@gamil.com");
		person.setNo(458772645);
		personService.createPerson(person);

		Cab cab = new Cab();
		cab.setName("star cab");
		cab.setType("A.C");
		cabService.cerateCab(cab);

		Cab cab1 = new Cab();
		cab1.setName("fad cab");
		cab1.setType("Non-A.C");
		cabService.cerateCab(cab1);

		Cab cab2 = new Cab();
		cab2.setName("ram cab");
		cab2.setType("A.C");
		cabService.cerateCab(cab2);

	}
}
