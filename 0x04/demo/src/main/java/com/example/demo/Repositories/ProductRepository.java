package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
    
}
