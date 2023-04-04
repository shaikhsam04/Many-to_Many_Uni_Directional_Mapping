package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonService {
	PersonDao personDao = new PersonDao();

	public Person createPerson(Person person) {
		return personDao.createPerson(person);
	}

	public Person getPersonById(int id) {
		return personDao.getPersonByID(id);
	}

	public Person deletePersonById(int id) {
		return personDao.deletPerson(id);
	}

	public Person updatePerson(int id, String Name, String Email, long no) {

		return personDao.updatePerson(id, Name, Email, no);
	}

	public List<Person> readAllPersons() {
		return personDao.readAllpPersons();
	}
}
