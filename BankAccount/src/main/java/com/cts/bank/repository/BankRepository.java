package com.cts.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.bank.entity.BankAccount;

@Repository
public interface BankRepository extends JpaRepository<BankAccount,Integer> {

	List<BankAccount> findAllByCustomerId(int customerId);

}