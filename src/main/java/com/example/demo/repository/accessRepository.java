package com.example.demo.repository;

import com.example.demo.model.access;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accessRepository extends JpaRepository<access, String>{
    // Define custom queries or use default methods provided by JpaRepository
}
