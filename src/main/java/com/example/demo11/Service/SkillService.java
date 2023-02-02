package com.example.demo11.Service;

import com.example.demo11.Entity.Skill;
import com.example.demo11.Entity.SkillType;
import com.example.demo11.Repository.LoginRepository;
import com.example.demo11.Repository.SkillRepository;
import com.example.demo11.Repository.SkillTypeRepository;
import com.example.demo11.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private SkillRepository skillRepository;
    private UserRepository userRepository;

    private SkillTypeRepository skillTypeRepository;
    private LoginRepository loginRepository;
    public SkillService(SkillRepository skillRepository,UserRepository userRepository,LoginRepository loginRepository,SkillTypeRepository skillTypeRepository){
        this.skillRepository = skillRepository;
        this.userRepository = userRepository;
        this.loginRepository = loginRepository;
        this.skillTypeRepository =skillTypeRepository;
    }

    public List<Skill> getSkills(int lid){
        return skillRepository.findSkillByUser(userRepository.findByEmail(loginRepository.findById(lid).orElse(null).getEmail()));
    }

    public Skill addSkill(int sid, int lid){
        Skill sk = new Skill(skillTypeRepository.findById(sid).orElse(null),userRepository.findByEmail(loginRepository.findById(lid).orElse(null).getEmail()));
        return skillRepository.save(sk);
    }

    public Skill editSkill(Skill skill){

        return skillRepository.save(skill);
    }
    public void deleteSkill(int sid){
        skillRepository.deleteById(sid);
    }

}
