package com.example.webservicejpaspring.repositories;

import com.example.webservicejpaspring.entities.OrderItem;
import com.example.webservicejpaspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
