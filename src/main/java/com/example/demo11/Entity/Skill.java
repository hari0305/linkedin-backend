package com.example.demo11.Entity;

import javax.persistence.*;

@Entity
@Table(name ="skill")
public class Skill {

    @Id
    @GeneratedValue
    public int id;

    @OneToOne
    @JoinColumn(name="skill_type_id",referencedColumnName = "id")
    public SkillType skillTypeId;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    public User user;

    public Skill(SkillType typeid, User user){
        this.skillTypeId = typeid;
        this.user = user;
    }


    public Skill() {

    }
}
