package com.hyperapps.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name", length = 100)
	private String firstName;
	@Column(name = "last_name", length = 100)
	private String lastName;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "email", length = 50)
	private String email;
	@Column(name = "phone", length = 50)
	private String phone;
	@Column(name = "status")
	private boolean status;
	@Column(name = "branch")
	private int branch;
	@Column(name = "store")
	private int store;
	@Column(name = "created")
	private Date created;
	@Column(name = "updated")
	private Date updated;
}
