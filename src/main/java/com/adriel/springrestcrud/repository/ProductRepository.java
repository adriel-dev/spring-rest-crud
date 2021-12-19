package com.adriel.springrestcrud.repository;

import com.adriel.springrestcrud.models.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
    

}
