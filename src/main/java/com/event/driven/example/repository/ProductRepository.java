package com.event.driven.example.repository;

import com.event.driven.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{
}
