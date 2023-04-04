package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Cab;

public class CabDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sameer");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Cab createCab(Cab cab) {
		entityTransaction.begin();
		entityManager.persist(cab);
		entityTransaction.commit();

		System.out.println("Cab Detail save..");
		return cab;
	}

	public Cab getCabById(int id) {
		Cab c1 = entityManager.find(Cab.class, id);
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getType());
		System.out.println("Cab Details..");
		return c1;
	}

	public Cab deleteCabByID(int id) {
		Cab c1 = entityManager.find(Cab.class, id);

		entityTransaction.begin();
		entityManager.remove(c1);
		entityTransaction.commit();

		System.out.println("Delete Cab..");
		return c1;
	}

	public Cab updateCab(int id, String name, String type) {
		Cab c1 = entityManager.find(Cab.class, id);

		if (c1 != null) {
			c1.setName(name);
			c1.setType(type);
			entityTransaction.begin();
			entityManager.merge(c1);
			entityTransaction.commit();
		} else {
			System.out.println("Detail updated..");
		}
		return c1;
	}

	public Cab readById(int id) {
		return entityManager.find(Cab.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Cab> readAllCabs() {
		String sql = "Select s From Cab s";
		Query query = entityManager.createQuery(sql);
		List<Cab> cabs = query.getResultList();
		return cabs;
	}
}
