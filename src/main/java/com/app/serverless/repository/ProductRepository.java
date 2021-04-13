package com.app.serverless.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.serverless.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
