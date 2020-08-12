package com.cts.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccont {
	
	private int bankId;
	
	private String bankName;
	
	private String accountNumber;
	
	private String IFSCCode;
	
	private String MICRCode;	
	
	private int customerId;
}