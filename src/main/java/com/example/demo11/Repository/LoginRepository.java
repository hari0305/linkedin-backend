package com.example.demo11.Repository;


import com.example.demo11.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Integer> {
    Login findByEmail(String email);
}
