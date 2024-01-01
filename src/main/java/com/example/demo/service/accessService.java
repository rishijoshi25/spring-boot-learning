package com.example.demo.service;

import com.example.demo.model.Access;
import com.example.demo.repository.AccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AccessService {
    private final AccessRepository accRepository;

    @Autowired
    public AccessService(AccessRepository accRepository) {
        this.accRepository = accRepository;
    }

    public List<Access> getAllUsers() {
        return accRepository.findAll();
    }

    public List<Access> updateUserAcc(Map<String, String> userAccessMap){
        List<Access> updatedAccessList = new ArrayList<>();
        
        userAccessMap.forEach((username, acc) -> {
            Access access = accRepository.findByUsername(username);

            if(access != null){
                access.setAcc(acc);
                accRepository.save(access);
                updatedAccessList.add(access);
            }
        });

        return updatedAccessList;
    }

    public Access addUser(String username, String acc) {
        Access user = new Access();
        user.setUsername(username);
        user.setAcc(acc);

        return accRepository.save(user);
    }
}
