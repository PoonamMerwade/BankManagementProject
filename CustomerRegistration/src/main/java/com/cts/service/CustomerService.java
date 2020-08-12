package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Customer;
//import com.cts.entity.CustomerDetailsPrincipal;
import com.cts.model.BankAccount;
import com.cts.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	BankAccountProxyService bankAccountProxyService;
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	public void deleteCustomer(String userName) {
		customerRepository.deleteCustomer(userName);
		
	}

	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}
	
	public List<Customer> getAll() {
		List<Customer> customers = (List<Customer>) customerRepository.findAll();
		List<BankAccount> accounts = bankAccountProxyService.getAll();
		customers.stream().forEach(customer -> {
			ArrayList<BankAccount> list = new ArrayList<>();
			accounts.stream().forEach(account -> {
				if (customer.getCustomerId() == account.getCustomerId()) {
					list.add(account);
				}
			});
			customer.setBankAccount(list);
		});
		return customers;

	}

	public List<BankAccount> getAccountByCustomerId(int customerId) {
		return bankAccountProxyService.getBankAccount(customerId);
	}
}




//List<Customer> customers=(List<Customer>) customerRepository.findAll();
//for (Customer customer : customers) {
//	int customerId = customer.getCustomerId();
//	customer.setBankAccount(bankAccountProxyService.getBankAccount(customerId));
//}
//return customers;

//public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//Customer customer=customerRepository.findUserByUserName(username);
//if(customer==null){
//	throw new UsernameNotFoundException("No user found");
//}
//return new CustomerDetailsPrincipal(customer);
//}