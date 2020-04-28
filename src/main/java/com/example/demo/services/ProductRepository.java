package com.example.demo.services;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
