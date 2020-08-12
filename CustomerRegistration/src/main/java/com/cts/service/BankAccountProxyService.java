package com.cts.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.model.BankAccount;

@FeignClient(name = "account-service")
public interface BankAccountProxyService {

	@GetMapping(value = "/account/customer/{customerId}") 
	List<BankAccount> getBankAccount(@PathVariable(name = "customerId")int customerId);

	@GetMapping("/account/all")
	List<BankAccount> getAll();
	
}