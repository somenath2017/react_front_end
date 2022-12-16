package com.sc.techbites.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sc.techbites.entity.Product;

public interface SpringBootBasicRepository extends JpaRepository<Product,Integer> {

	 Product findByName(String name);
}
