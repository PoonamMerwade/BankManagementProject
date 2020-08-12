package com.cts.bank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(description = "This is the bank account model")
@Entity(name="account")
public class BankAccount {
	
	@Id
	@ApiModelProperty(value = "Id of the customer")
	private int bankId;
	
	@NotNull(message = "Name cannot be null")
	@Pattern(regexp = "[a-zA-Z]{2}[A-Za-z\\s]*", message = "bank name can only have alphabets with minimum length 2")
	@Size(min = 2, message = "first name must have atleast 2 characters")
	@ApiModelProperty(value="Name of the Bank")
	private String bankName;
	
	@NotNull(message = "Account number cannot be null")
	@Pattern(regexp ="[1-9]{1}[0-9]{9}", message = "Account number must be of 10 digits and should not begin with 0")
	@ApiModelProperty(value="Account number of the customer")
	private String accountNumber;
	
	@NotNull(message = "IFSC cannot be null")
	@Pattern(regexp ="^[A-Z]{4}0[A-Z0-9]{6}$",message="IFSC should be 11 characters long")
	@ApiModelProperty(value="IFSC code of the bank")
	private String IFSCCode;
	
	@NotNull(message = "MICR number cannot be null")
	@Pattern(regexp ="[1-9]{1}[0-9]{9}", message = "MICR must be of 10 digits")
	@ApiModelProperty(value="MICR code of the bank")
	private String MICRCode;	
	
	@ApiModelProperty(value="customer Id of the customer")
	private int customerId;
}
