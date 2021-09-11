package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {

	// We have to generate Id is automatically
	@Id
	private int customerId;
	@Column
	private String customerName;
	@Column
	private String Password;
	@Column
	private String confirmPassword;
	@Column
	private String mobileNumber;
	@Column
	private String email;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	
}
