package com.cimb.sProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cimb.sProject.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
