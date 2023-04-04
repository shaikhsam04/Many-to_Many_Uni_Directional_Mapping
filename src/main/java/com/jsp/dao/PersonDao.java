package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sameer");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person createPerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();

		System.out.println("Person Details Saved..");
		return person;

	}

	public Person getPersonByID(int id) {
		Person p1 = entityManager.find(Person.class, id);
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getEmail());
		System.out.println(p1.getNo());
		System.out.println("Person Details");
		return p1;
	}

	public Person deletPerson(int id) {
		Person p1 = entityManager.find(Person.class, id);

		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("Person Details Deleted..");
		return p1;
	}

	public Person updatePerson(int id, String Name, String Email, long no) {
		Person p1 = entityManager.find(Person.class, id);

		if (p1 != null) {
			p1.setName(Name);
			p1.setEmail(Email);
			p1.setNo(no);
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();

		} else {
			System.out.println("Person Details found..");

		}
		return p1;
	}

	public Person readById(int id) {
		return entityManager.find(Person.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Person> readAllpPersons() {
		String sql = "Select s From Person s";
		Query query = entityManager.createQuery(sql);
		List<Person> persons = query.getResultList();
		return persons;
	}
}
