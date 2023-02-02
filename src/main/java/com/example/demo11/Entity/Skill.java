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
    public SkillType skill_type_id;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    public User user;

    public Skill(SkillType typid, User user){
        this.skill_type_id = typid;
        this.user = user;
    }


    public Skill() {

    }
}
