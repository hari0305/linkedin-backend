package com.example.demo11.Service;

import com.example.demo11.Entity.Login;
import com.example.demo11.Entity.User;
import com.example.demo11.Repository.LoginRepository;
import com.example.demo11.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private LoginRepository loginRepository;

    UserService(UserRepository userRepository, LoginRepository loginRepository){
        this.userRepository = userRepository;
        this.loginRepository = loginRepository;
    }


    public void createUser(User user, int lid) {
        Login temp = loginRepository.findById(lid).orElse(null);
        User u1 = new User(user.getFirst_name(),user.getLast_name(),user.getEmail(),user.getCity(),temp);
        userRepository.save(u1);
    }

    public void delete(int id) {
        Login temp = loginRepository.findById(id).orElse(null);
        assert temp != null;
        User td = userRepository.findByEmail(temp.getEmail());
        userRepository.deleteById(td.getId());
    }

    public User update(User user, int lid){
//        Login temp = loginRepository.findById(lid).orElse(null);
//        User k = userRepository.findByEmail(temp.getEmail());
//        User u1 = new User(k.getId(),user.getFirst_name(),user.getLast_name(),user.getEmail(),user.getCity(),temp);
//        userRepository.save(u1);
        return userRepository.save(user);
//        return u1;
    }

    public User getUserbyloginid(int lid){
        Login temp = loginRepository.findById(lid).orElse(null);
        return userRepository.findByEmail(temp.getEmail());
    }
}
