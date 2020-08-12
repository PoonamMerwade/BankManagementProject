package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

//	Customer findUserByUserName(String username);
	
	@Query(value="delete from customer where userName=:userName")
	void deleteCustomer(@Param("userName") String userName );
	
}