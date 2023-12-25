package com.example.demo.service;

import com.example.demo.model.access;
import com.example.demo.repository.accessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class accessService {
    private final accessRepository accRepository;

    @Autowired
    public accessService(accessRepository accRepository) {
        this.accRepository = accRepository;
    }

    public List<access> getAllUsers() {
        return accRepository.findAll();
    }
}
