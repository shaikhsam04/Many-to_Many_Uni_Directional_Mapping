package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Cab;
import com.jsp.dto.Person;
import com.jsp.service.CabService;
import com.jsp.service.PersonService;

public class ReadAllController {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		List<Person> persons = personService.readAllPersons();

		for (Person person : persons) {
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getEmail());
			System.out.println(person.getNo());
			System.out.println();
		}

		CabService cabService = new CabService();
		List<Cab> cabs = cabService.readAllCabs();

		for (Cab cab : cabs) {
			System.out.println(cab.getId());
			System.out.println(cab.getName());
			System.out.println(cab.getType());
			System.out.println();
		}

	}
}
