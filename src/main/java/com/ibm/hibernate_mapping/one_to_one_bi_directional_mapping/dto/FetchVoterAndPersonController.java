package com.ibm.hibernate_mapping.one_to_one_bi_directional_mapping.dto;

public class FetchVoterAndPersonController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonVoterDao dao = new PersonVoterDao();
		
		
		boolean b = dao.deleteVoterIdByIdDao(234);
	}

}
