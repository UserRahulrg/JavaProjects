package com.ibm.hibernate_one_to_many_uni_mapping.controller;

import com.ibm.hibernate_one_to_many_uni_mapping.dao.PersonPanDao;
import com.ibm.hibernate_one_to_many_uni_mapping.dto.Pan;
import com.ibm.hibernate_one_to_many_uni_mapping.dto.Person;

public class InsertPersonPanController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonPanDao personPanDao = new PersonPanDao();
		
		Pan pan = new Pan("3RBTEW65","noida sector 16");
		
		Person person = new Person(6966, "amir","abc@gmail.com",null);
		
		personPanDao.savePersonAndPanDao(person,pan);
		
		
		
		
	}

}
