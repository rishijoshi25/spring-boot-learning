package com.example.demo.repository;

import com.example.demo.model.Access;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRepository extends JpaRepository<Access, String>{
    Access findByUsername(String username);
}
