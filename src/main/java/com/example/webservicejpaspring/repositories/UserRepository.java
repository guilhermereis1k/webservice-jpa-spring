package com.example.webservicejpaspring.repositories;

import com.example.webservicejpaspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
