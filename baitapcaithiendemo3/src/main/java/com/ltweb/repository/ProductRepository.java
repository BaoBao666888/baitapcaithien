package com.ltweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltweb.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
