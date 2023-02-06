package com.example.demo11.Repository;

import com.example.demo11.Entity.Experience;
import com.example.demo11.Entity.Skill;
import com.example.demo11.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill,Integer> {
    List<Skill> findSkillByUser(User user);
    List<Experience> findExperiencesByUser(User user);

}
