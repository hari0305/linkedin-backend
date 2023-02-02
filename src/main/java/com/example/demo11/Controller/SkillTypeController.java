package com.example.demo11.Controller;

import com.example.demo11.Entity.Skill;
import com.example.demo11.Entity.SkillType;
import com.example.demo11.Repository.SkillTypeRepository;
import com.example.demo11.Service.skillTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillTypeController {

    skillTypeService skillTypeService;

    SkillTypeController(skillTypeService skillTypeService){
        this.skillTypeService = skillTypeService;
    }

    @RequestMapping("/add-skill-type")
    public void add(String skill){
        skillTypeService.add(skill);
    }
    @RequestMapping("/get-skill-type")
    public List<SkillType> get(){
        return skillTypeService.get();
    }
}
