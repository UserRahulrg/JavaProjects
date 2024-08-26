package com.ibm.hibernate_mapping.one_to_one_bi_directional_mapping.dto;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class VoterId {

	@Id
	private int id;
	private String name;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	private VoterId voterId;
	
	
	
	public VoterId(int i, String string, int j, Object object) {
		// TODO Auto-generated constructor stub
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Person getPerson() {
		// TODO Auto-generated method stub
		return null;
	}

}
