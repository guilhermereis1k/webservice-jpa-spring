package com.example.webservicejpaspring.repositories;

import com.example.webservicejpaspring.entities.Category;
import com.example.webservicejpaspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
