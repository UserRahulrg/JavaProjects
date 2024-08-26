package com.ibm.hibernate_one_to_many_uni_mapping.controller;

import java.util.ArrayList;

import com.ibm.hibernate_one_to_many_uni_mapping.dao.UniversityCollegeDao;
import com.ibm.hibernate_one_to_many_uni_mapping.dto.College;
import com.ibm.hibernate_one_to_many_uni_mapping.dto.University;

public class InsertUniversityCollegeController {

	public static void main(String[] args) {
		
		UniversityCollegeDao dao = new UniversityCollegeDao();
		College college1 = new college("QSP","noida");
	}
}








