package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ACCESS_TEST")
public class Access {
    @Id
    @Column(name="ID")
    private int id;

    @Column(name="USERNAME")
    private String username;

    @Column(name="ACC")
    private String acc;

    public Access() {
        //default constructor
    }

    public Access(int id, String username, String acc){
        this.id = id;
        this.username = username;
        this.acc = acc;
    }

    //Getters
    public int getId(){ return id; }
    public String getUsername() { return username; }
    public String getAcc() { return acc; }

    //Setters
    public void setId(int id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setAcc(String acc) { this.acc = acc; }
}
