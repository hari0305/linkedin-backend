package com.example.demo11.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skill_type")
public class SkillType {

    @Id
    @GeneratedValue
    public int id;

    public String skill_name;

    public SkillType(){}

    public SkillType(String name){
        this.skill_name = name;
    }
}
