package com.adriel.springrestcrud.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.adriel.springrestcrud.models.Product;
import com.adriel.springrestcrud.repository.ProductRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {

    ProductRepository productRepository;
    
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id){
        return productRepository.findById(id).get();
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id){
        productRepository.deleteById(id);
    }

}
