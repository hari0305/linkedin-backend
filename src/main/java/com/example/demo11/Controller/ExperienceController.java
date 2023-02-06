package com.example.demo11.Controller;

import com.example.demo11.Entity.Experience;
import com.example.demo11.Service.ExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExperienceController {
    private ExperienceService experienceService;

    ExperienceController(ExperienceService experienceService){
        this.experienceService = experienceService;
    }

    @RequestMapping(value="/createExperience/lid/{lid}")
    public Experience create(@RequestBody Experience exp, @PathVariable int lid){
        return experienceService.create(exp,lid);
    }

    @RequestMapping(value = "/updateExperience")
    public Experience update(@RequestBody Experience exp){
        return experienceService.update(exp);
    }


    @RequestMapping(value="/delete-exp/id/{id}")
    public String delete(@PathVariable int id){
        experienceService.delete(id);
        return "deleted";
    }

//    @RequestMapping(value="/getexperience/id/{id}")
//    public ResponseEntity<Experience> get(@PathVariable int id){
//        Experience temp = experienceService.get(id);
//        return new ResponseEntity<>(temp,HttpStatus.OK);
//    }

    @RequestMapping(value="/getexperience/id/{id}")
    public List<Experience> get(@PathVariable int id){
        return experienceService.get(id);
    }
}
