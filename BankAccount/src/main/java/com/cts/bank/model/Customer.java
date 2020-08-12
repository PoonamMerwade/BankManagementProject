package com.cts.bank.model;

import java.util.Date;
import java.util.List;

import com.cts.bank.entity.BankAccount;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Customer {
	@ApiModelProperty(value = "Id of the customer")
	private int customerId;
	
	@ApiModelProperty(value = "first name of the customer")
	private String firstName;
	
	@ApiModelProperty(value = "last name of the customer")
	private String lastName;
	
	@ApiModelProperty(value = "PAN of the customer")
	private String userName;
	
	@ApiModelProperty(value = "password of the customer")
	private String password;
	
	@ApiModelProperty(value = "Email Id of the customer")
	private String emailId;
	
	@ApiModelProperty(value = "DOB of the customer")
	private Date DOB;
	
	@ApiModelProperty(value = "Phone of the customer")
	private String phoneNumber;
	
	@ApiModelProperty(value="List of bankaccount by customer")
	private List<BankAccount> bankAccount;
	
	public Customer(){
		super();
	}
	
	public Customer(int i){
		this.customerId=i;
	}
	
	public Customer(String firstName, String lastName, String userName, String password, String emailId,
			Date dOB,String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		DOB = dOB;
		this.phoneNumber=phoneNumber;
	}
}