package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ACCESS_TEST")
public class access {
    @Id
    @Column(name="USER_NAME")
    private String USER_NAME;

    @Column(name="ACC")
    private String ACC;

    public access() {
        //default constructor
    }

    public access(String USER_NAME, String ACC){
        this.USER_NAME = USER_NAME;
        this.ACC = ACC;
    }

    //Getters
    public String getUsername() { return USER_NAME; }
    public String getAcc() { return ACC; }

    //Setters
    public void setUsername(String USER_NAME) { this.USER_NAME = USER_NAME; }
    public void setAcc(String ACC) { this.ACC = ACC; }
}
