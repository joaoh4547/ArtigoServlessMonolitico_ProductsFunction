package com.app.serverless.service;

import com.app.serverless.model.Product;
import com.app.serverless.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
       
        return productRepository.findAll();
    }

}
