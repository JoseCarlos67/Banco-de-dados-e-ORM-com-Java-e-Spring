package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.entitie.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
