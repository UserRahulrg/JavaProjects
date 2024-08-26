package com.ibm.hibernate_mapping.one_to_one_bi_directional_mapping.dto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonVoterDao 
	 {
		// TODO Auto-generated method stub
		
		EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		public Person savePersonVoterDao(Person person) {
			
			try {     
				et.begin();
				em.persist(person);
				et.commit();
				return person;
			}
			catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public VoterId fetchVoterIdAndPersonByVoterId(int voterId) {
			try {
				return em.find(VoterId.class, voterId);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				return null; 
			}
		}
		
		public boolean deleteVoterIdByIdDao(int voterId) 
		{	
			try {
				VoterId id = em.find(VoterId.class, voterId);
				Person person = id.getPerson();
				et.begin();
				person.setVoterId(null);
				em.merge(person);
				em.remove(id);
				et.commit();
				return true;
			}
			catch (Exception e) {
				return true;
			}
		}
}
		
	




