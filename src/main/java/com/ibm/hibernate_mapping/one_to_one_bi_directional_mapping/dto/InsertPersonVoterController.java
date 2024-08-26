package com.ibm.hibernate_mapping.one_to_one_bi_directional_mapping.dto;

public class InsertPersonVoterController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonVoterDao dao = new PersonVoterDao();
		
		VoterId voterId = new VoterId(234,"noida",26,null);
		
		Person person = new Person(112,"akhil","akhil@gmail.com",voterId);
		
		//voterId.setPerson(person);
		
		dao.savePersonVoterDao(person);
		
		
	}

}
