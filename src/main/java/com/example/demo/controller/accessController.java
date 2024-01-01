package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Access;
import com.example.demo.service.AccessService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
public class AccessController {
    private final AccessService accService;

    @Autowired
    public AccessController(AccessService AccService){
        this.accService = AccService;
    }

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Spring is here!";
    }

    @GetMapping("/user-list")
    public List<Access> getAllUsers() {
        return accService.getAllUsers();
    }

    @PatchMapping("/user-update")
    public ResponseEntity<List<Access>> updateUserAccess(@RequestBody Map<String, String> userAccMap) {
        List<Access> updatedAccessList = accService.updateUserAcc(userAccMap);

        if(!updatedAccessList.isEmpty()) 
            return ResponseEntity.ok(updatedAccessList);
        else 
            return ResponseEntity.notFound().build();
    }

    @PostMapping("/add-user")
    public Access addUser(@RequestBody Access acc) {
        return accService.addUser(acc);
    }
    
    
}
