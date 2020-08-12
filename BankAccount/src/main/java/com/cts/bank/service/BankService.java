package com.cts.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bank.entity.BankAccount;
import com.cts.bank.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	BankRepository bankRepository;
	
	public void addAccount(BankAccount account) {
		bankRepository.save(account);
		
	}

	public void updateAccount(BankAccount account) {
		bankRepository.save(account);
		
	}

	public List<BankAccount> getBankAccountByCustomerId(int customerId) {
		return bankRepository.findAllByCustomerId(customerId);
	}

	public List<BankAccount> getAccount() {
		return (List<BankAccount>) bankRepository.findAll();
	}
}
