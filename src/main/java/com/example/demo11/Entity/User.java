package com.example.demo11.Entity;

import com.example.demo11.Entity.Login;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    int id;
    @Column(name="description")
    String description;

    @Column(name="first_name")
    String firstName;
    @Column(name="last_name")
    String lastName;
    @Column(name="phone")
    String phone;
    @Column(name="email")
    String email;
    @Column(name="city")
    String city;
    @Column(name="state")
    String state;
    @Column(name="country")
    String country;

    @OneToOne
    @JoinColumn(name="login_id",referencedColumnName = "id")
    public Login login;

    public User() {

    }

    public User(String first_name, String last_name, String email, String city, Login login, String description, String state, String country, String phone){
        this.firstName = first_name;
        this.lastName = last_name;
        this.email = email;
        this.city = city;
        this.description = description;
        this.state = state;
        this.country = country;
        this.phone = phone;
        this.login = login;
    }

    public User(String first_name, String last_name, String email, String city, Login login){
        this.firstName = first_name;
        this.lastName = last_name;
        this.email = email;
        this.city = city;
        this.login = login;
    }

    public User(int id,String first_name, String last_name, String email, String city, Login login){
        this.id = id;
        this.firstName = first_name;
        this.lastName = last_name;
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

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
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
