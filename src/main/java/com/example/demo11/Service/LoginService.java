package com.example.demo11.Service;

import com.example.demo11.Entity.Login;
import com.example.demo11.Entity.User;
import com.example.demo11.Entity.WebRegistration;
import com.example.demo11.Repository.LoginRepository;
import com.example.demo11.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private LoginRepository loginRepository;
    private UserRepository userRepository;
    LoginService(LoginRepository loginRepository,UserRepository userRepository){
        this.loginRepository = loginRepository;
        this.userRepository = userRepository;
    }

    public Login createLogin(WebRegistration login){
        Login temp = new Login(login.email,login.password);
        loginRepository.save(temp);
        User user = new User(login.firstName, login.lastName, login.email, login.city, temp, login.description, login.state, login.country,login.phone );
        userRepository.save(user);
        return temp;
    }

    public Login validateLogin(Login login) {
        Login temp = loginRepository.findByEmail(login.getEmail());
        if( temp != null && temp.getEmail().equals(login.getEmail()) && temp.getPassword().equals(login.getPassword())){
            return temp;
        }
        else{
            return null;
        }
    }
}
