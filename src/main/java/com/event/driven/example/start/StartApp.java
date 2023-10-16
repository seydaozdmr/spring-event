package com.event.driven.example.start;

import com.event.driven.example.model.Product;
import com.event.driven.example.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    private final ProductService productService;

    public StartApp(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        Product p1 = new Product();
        p1.setName("Telefon");
        productService.createProduct(p1);


    }
}
