package com.example.demo11.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "education")
public class Education {
    @Id
    @GeneratedValue
    public int id;

    public String name;
    public String description;
    public Date start_date;
    public Date end_date;

    public  String degree;
    public String branch;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    public User user;

    public Education(){}

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public String getName() {
        return name;
    }

    public User getUser() {
        return user;
    }

    public String getBranch() {
        return branch;
    }

    public String getDegree() {
        return degree;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
