package com.example.demo11.Repository;

import com.example.demo11.Entity.Education;
import com.example.demo11.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationRepository extends JpaRepository<Education,Integer> {
    List<Education> findEducationByUser(User user);
}
