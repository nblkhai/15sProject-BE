package com.cimb.sProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cimb.sProject.entity.Transactions;

public interface TransactionRepo extends JpaRepository<Transactions, Integer> {

}
