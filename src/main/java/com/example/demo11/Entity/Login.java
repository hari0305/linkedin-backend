package com.example.demo11.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {

    @Id
    @GeneratedValue
    int id;

    String email;
    String password;

    public Login(String email, String password){
        this.email = email;
        this.password = password;
    }

    public Login() {

    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
