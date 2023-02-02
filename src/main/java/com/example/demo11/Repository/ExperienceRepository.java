package com.example.demo11.Repository;

import com.example.demo11.Entity.Experience;
import com.example.demo11.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience,Integer> {
    List<Experience> findExperiencesByUser(User user);
}
