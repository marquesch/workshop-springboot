package com.marquesch.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marquesch.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
