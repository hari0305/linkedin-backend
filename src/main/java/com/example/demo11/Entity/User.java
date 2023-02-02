package com.example.demo11.Entity;

import com.example.demo11.Entity.Login;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    int id;
    String description;
    String first_name;
    String last_name;
    String phone;
    String email;
    String city;
    String state;
    String country;

    @OneToOne
    @JoinColumn(name="login_id",referencedColumnName = "id")
    public Login login;

    public User() {

    }

    public User(String first_name, String last_name, String email, String city, Login login, String description, String state, String country, String phone){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.description = description;
        this.state = state;
        this.country = country;
        this.phone = phone;
        this.login = login;
    }

    public User(String first_name, String last_name, String email, String city, Login login){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.login = login;
    }

    public User(int id,String first_name, String last_name, String email, String city, Login login){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.login = login;
    }



    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public Login getLogin() {
        return login;
    }
}
