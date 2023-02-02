package com.example.demo11.Controller;

import com.example.demo11.Entity.User;
import com.example.demo11.Service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private UserService userService;

    UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/createUser/id/{id}", method = RequestMethod.POST)
    public String createUser(@RequestBody User user, @PathVariable int id){
        userService.createUser(user,id);
        return "saved";
    }

    @RequestMapping(value= "/updateUser/id/{id}")
    public User updateUser(@RequestBody User user, @PathVariable int id){
        return userService.update(user,id);

    }

    @RequestMapping(value= "/deleteUser/{id}" , method = RequestMethod.POST)
    public String deleteuserbyid(@PathVariable int id){
        userService.delete(id);
        return "deleted";
    }

    @RequestMapping(value= "/getUserbyid/{id}", method = RequestMethod.GET)
    public User getuser(@PathVariable int id){
        return userService.getUserbyloginid(id);
    }
}
