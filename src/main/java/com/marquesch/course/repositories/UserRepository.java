package com.marquesch.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marquesch.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
