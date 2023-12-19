package com.hyperapps.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {

	private int id;
	private String firstName;
	private String lastName;
	private Date dob;
	private String email;
	private String phone;
	private boolean status;
	private int branch;
	private int store;
	private Date created;
	private Date updated;
}
