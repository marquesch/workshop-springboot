package com.marquesch.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marquesch.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
