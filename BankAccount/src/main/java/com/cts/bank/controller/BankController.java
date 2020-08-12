package com.cts.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bank.entity.BankAccount;
import com.cts.bank.service.BankService;
@RequestMapping("/account")
@RestController
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@GetMapping("/all")
	List<BankAccount> getAll() {
		return bankService.getAccount();
	}

	@PostMapping("/add")
	public void addAccount(BankAccount account){
		bankService.addAccount(account);
	}
	
	@PutMapping("/update")
	public void updateAccount(BankAccount account){
		bankService.updateAccount(account);
	}
	
	@GetMapping(value="/customer/{customerId}")
	List<BankAccount> getBankAccountByCustomerId(@PathVariable int customerId){
		return bankService.getBankAccountByCustomerId(customerId);
	}
}
