package com.example.demo11.Controller;

import com.example.demo11.Entity.Login;
import com.example.demo11.Entity.WebRegistration;
import com.example.demo11.Service.LoginService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private LoginService loginService;

    LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @RequestMapping(value= "/create-login", method = RequestMethod.POST)
    public String createLogin(@RequestBody WebRegistration login){
        loginService.createLogin(login);
        return "Login Created!";
    }

    @RequestMapping(value = "/validate-login", method = RequestMethod.POST)
    public Login validateLogin(@RequestBody Login login){
        return loginService.validateLogin(login);
    }

}
