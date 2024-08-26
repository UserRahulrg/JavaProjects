package com.ibm.hibernate_one_to_many_uni_mapping.dao;

import jakarta.persistence.Persistence;

public class UniversityCollegeDao {
	
	EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	
	
}
