package com.example.demo11.Controller;

import com.example.demo11.Entity.Skill;
import com.example.demo11.Service.SkillService;
import com.example.demo11.Entity.SkillType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillController {
    public SkillService skillService;

    public SkillController(SkillService skillService){
        this.skillService = skillService;
    }

    @RequestMapping("/get-skill/lid/{lid}")
    public List<Skill> get(@PathVariable int lid){
        return skillService.getSkills(lid);
    }
    @RequestMapping("/add-skill/lid/{lid}/sid/{sid}")
    public Skill add(@PathVariable int lid, @PathVariable int sid){
        return skillService.addSkill(sid,lid);
    }

//    @RequestMapping("/add-skill/lid/{lid}")
//    public Skill add(@PathVariable int lid, @RequestBody SkillType skilltype){
//        return skillService.addSkill(skilltype,lid);
//    }
    @RequestMapping("/update-skill/lid/{lid}")
    public Skill update(@RequestBody Skill skill){
        return skillService.editSkill(skill);
    }
    @RequestMapping("/delete-skill/sid/{sid}")
    public void delete(@PathVariable int sid){
        skillService.deleteSkill(sid);
    }
}
