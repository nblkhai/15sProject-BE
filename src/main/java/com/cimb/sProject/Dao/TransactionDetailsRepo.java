package com.cimb.sProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cimb.sProject.entity.TransactionDetails;

public interface TransactionDetailsRepo extends JpaRepository<TransactionDetails, Integer>{

}
