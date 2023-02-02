package com.example.demo11.Controller;

import com.example.demo11.Entity.Education;
import com.example.demo11.Service.EducationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EducationController {
    private EducationService educationService;

    EducationController(EducationService educationService){
        this.educationService = educationService;
    }

    @RequestMapping("/add-education/lid/{lid}")
    public Education create(@RequestBody Education education, @PathVariable int lid){
        return educationService.create(education,lid);
    }

    @RequestMapping("/edit-education")
    public Education update(@RequestBody Education education){
        return educationService.update(education);
    }

    @RequestMapping("/delete-education/eid/{eid}")
    public String delete(@PathVariable int eid){
        return educationService.delete(eid);
    }

    @RequestMapping("/get-education/lid/{lid}")
    public List<Education> get(@PathVariable int lid){
        return educationService.get(lid);
    }

}
