package com.example.demo11.Service;

import com.example.demo11.Repository.EducationRepository;
import com.example.demo11.Entity.Education;
import com.example.demo11.Entity.User;
import com.example.demo11.Repository.LoginRepository;
import com.example.demo11.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    private EducationRepository educationRepository;
    private UserRepository userRepository;

    private LoginRepository loginRepository;

    EducationService(EducationRepository educationRepository,UserRepository userRepository,LoginRepository loginRepository){
        this.educationRepository = educationRepository;
        this.userRepository = userRepository;
        this.loginRepository = loginRepository;
    }

    public Education create(Education education, int lid){
        Education temp = new Education();
        temp.setName(education.name);
        temp.setStartDate(education.startDate);
        temp.setStartDate(education.endDate);
        temp.setDescription(education.description);
        temp.setBranch(education.branch);
        temp.setDegree(education.degree);
        temp.setUser(userRepository.findByEmail(loginRepository.findById(lid).orElse(null).getEmail()));
        return educationRepository.save(temp);
    }

    public String delete(int eid){
        educationRepository.deleteById(eid);
        return "deleted";
    }

    public Education update(Education education){
        educationRepository.save(education);
        return education;
    }

    public List<Education> get(int lid){
        return educationRepository.findEducationByUser(userRepository.findByEmail(loginRepository.findById(lid).orElse(null).getEmail()));
    }
}
