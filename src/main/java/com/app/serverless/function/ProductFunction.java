package com.app.serverless.function;

import com.app.serverless.model.Product;
import com.app.serverless.service.ProductService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.List;
import java.util.function.Supplier;

@Component
public class ProductFunction implements Supplier<List<Product>> {

    @Autowired
    private ProductService productService;


    @Override
    public List<Product> get() {
        return productService.getAll();
    }
}
