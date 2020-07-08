package com.cimb.sProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cimb.sProject.entity.Category;
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
