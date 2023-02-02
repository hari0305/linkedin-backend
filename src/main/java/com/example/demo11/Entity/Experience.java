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

    public String name;
    public String description;
    public Date start_date;
    public Date end_date;
    public String title;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    public User user;

    public Experience(String name, String description, Date start_date, Date end_date, String title){
        this.name = name;
        this.description = description;
        this.start_date = start_date;
        this.end_date = end_date;
        this.title = title;
    }

    public Experience(){}

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

    public String getTitle() {
        return title;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
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
