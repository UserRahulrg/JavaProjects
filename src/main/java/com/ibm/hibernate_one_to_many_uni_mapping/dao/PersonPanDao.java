package com.ibm.hibernate_one_to_many_uni_mapping.dao;

import com.ibm.hibernate_one_to_many_uni_mapping.dto.Pan;
import com.ibm.hibernate_one_to_many_uni_mapping.dto.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonPanDao {

	public Person savePersonAndPanDao(Person person, Pan pan) {
		// TODO Auto-generated method stub
		EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.persist(pan);
			person.setPan(pan);
			em.persist(person);
			et.commit();
			return person;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
