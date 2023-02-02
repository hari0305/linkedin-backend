package com.example.demo11.Service;

import com.example.demo11.Entity.Experience;
import com.example.demo11.Repository.ExperienceRepository;
import com.example.demo11.Repository.LoginRepository;
import com.example.demo11.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    private ExperienceRepository experienceRepository;
    private UserRepository userRepository;

    private LoginRepository loginRepository;

    ExperienceService(ExperienceRepository experienceRepository,UserRepository userRepository,LoginRepository loginRepository){
        this.experienceRepository = experienceRepository;
        this.userRepository = userRepository;
        this.loginRepository = loginRepository;
    }

    public Experience create(Experience experience, int id){
        Experience temp = new Experience();
        temp.setDescription(experience.description);
        temp.setName(experience.name);
        temp.setStart_date(experience.start_date);
        temp.setEnd_date(experience.end_date);
        temp.setTitle(experience.title);
        temp.setUser(userRepository.findByEmail(loginRepository.findById(id).orElse(null).getEmail()));
        return experienceRepository.save(temp);
    }

    public Experience update(Experience experience){
        return experienceRepository.save(experience);
    }

    public boolean delete(int id){
        experienceRepository.deleteById(id);
        return true;
    }

    public List<Experience> get(int lid){
        return experienceRepository.findExperiencesByUser(userRepository.findByEmail(loginRepository.findById(lid).orElse(null).getEmail()));
    }

}
