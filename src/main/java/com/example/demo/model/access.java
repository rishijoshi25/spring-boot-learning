package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ACCESS_TEST")
public class Access {
    @Id
    @Column(name="USER_NAME")
    private String username;

    @Column(name="ACC")
    private String acc;

    public Access() {
        //default constructor
    }

    public Access(String username, String acc){
        this.username = username;
        this.acc = acc;
    }

    //Getters
    public String getUsername() { return username; }
    public String getAcc() { return acc; }

    //Setters
    public void setUsername(String username) { this.username = username; }
    public void setAcc(String acc) { this.acc = acc; }
}
