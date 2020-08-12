package com.cts.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@ApiModel(description = "This is the bank account model")
public class BankAccount {
		
		public BankAccount(int i, String string, String string2, int j, int customerId2) {
		// TODO Auto-generated constructor stub
	}
		

		public BankAccount(int bankId, String bankName, String accountNumber, String iFSCCode, String mICRCode) {
			super();
			this.bankId = bankId;
			this.bankName = bankName;
			this.accountNumber = accountNumber;
			IFSCCode = iFSCCode;
			MICRCode = mICRCode;
		}


		@ApiModelProperty(value = "Id of the customer")
		private int bankId;
		
		@ApiModelProperty(value="Name of the Bank")
		private String bankName;
		
		@ApiModelProperty(value="Account number of the customer")
		private String accountNumber;
		
		@ApiModelProperty(value="IFSC code of the bank")
		private String IFSCCode;
		
		@ApiModelProperty(value="MICR code of the bank")
		private String MICRCode;
		
		@ApiModelProperty(value = "A unique key for each customer")
		private int customerId;
	}