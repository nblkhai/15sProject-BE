package com.cimb.sProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cimb.sProject.entity.Products;

public interface ProductRepo extends JpaRepository<Products, Integer> {

}
