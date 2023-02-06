package com.example.demo11.Entity;

import javax.persistence.*;

@Entity
@Table(name="skill_type")
public class SkillType {

    @Id
    @GeneratedValue
    public int id;

    @Column(name="skill_name")
    public String skillName;

    public SkillType(){}

    public SkillType(String name){
        this.skillName = name;
    }
}
