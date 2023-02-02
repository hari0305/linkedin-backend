package com.example.demo11.Service;

import com.example.demo11.Entity.SkillType;
import com.example.demo11.Repository.SkillTypeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class skillTypeService {

    SkillTypeRepository skillTypeRepository;

    public skillTypeService(SkillTypeRepository skillTypeRepository){
        this.skillTypeRepository = skillTypeRepository;
    }


    public void add(String skill){
        SkillType temp = new SkillType(skill);
        skillTypeRepository.save(temp);
    }

    public List<SkillType> get(){
        return skillTypeRepository.findAll();
    }
}
