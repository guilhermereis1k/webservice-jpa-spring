package com.example.webservicejpaspring.repositories;

import com.example.webservicejpaspring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
