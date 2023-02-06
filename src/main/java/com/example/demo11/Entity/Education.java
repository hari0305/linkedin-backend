package com.example.demo11.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "education")
public class Education {
    @Id
    @GeneratedValue
    public int id;

    @Column(name = "name")
    public String name;

    @Column(name="description")
    public String description;

    @Column(name="start_date")
    public Date startDate;

    @Column(name="end_date")
    public Date endDate;

    @Column(name="degree")
    public  String degree;
    @Column(name="branch")
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

    public String getName() {
        return name;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate() {
        return startDate;
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

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
