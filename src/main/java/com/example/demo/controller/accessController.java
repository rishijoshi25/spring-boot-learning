package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.access;
import com.example.demo.service.accessService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class accessController {
    private final accessService accService;

    @Autowired
    public accessController(accessService AccService){
        this.accService = AccService;
    }

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Spring is here!";
    }

    @GetMapping("/user-list")
    public List<access> getAllUsers() {
        return accService.getAllUsers();
    }
    
}
