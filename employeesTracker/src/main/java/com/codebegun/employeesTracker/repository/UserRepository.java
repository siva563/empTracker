package com.codebegun.employeesTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebegun.employeesTracker.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
