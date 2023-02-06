package com.example.demo11.Entity;

import com.example.demo11.Entity.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "experience")
public class Experience {

    @Id
    @GeneratedValue
    int id;

    @Column(name="name")
    public String name;
    @Column(name="description")
    public String description;
    @Column(name="start_date")
    public Date startDate;
    @Column(name="end_date")
    public Date endDate;
    @Column(name="title")
    public String title;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    public User user;

    public Experience(String name, String description, Date start_date, Date end_date, String title){
        this.name = name;
        this.description = description;
        this.startDate = start_date;
        this.endDate = end_date;
        this.title = title;
    }

    public Experience(){}

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
