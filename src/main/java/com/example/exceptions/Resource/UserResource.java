package com.example.exceptions.Resource;


import com.example.exceptions.Service.UserService;
import com.example.exceptions.exception.RestrictedNameException;
import com.example.exceptions.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "id") String id){
        userService.deleteUser(id);
    }

    @GetMapping
    public List<User> getUserByName(@RequestParam(name = "name") String name) throws RestrictedNameException {
        if(name.equalsIgnoreCase("root")){
            throw new RestrictedNameException();
        }

        return userService.getUserByName(name);
    }

    @GetMapping
    public User getUserById(@RequestParam(name = "id")String id){
        return userService.getUserById(id);
    }
    @ExceptionHandler(NoSuchElementException.class)
    public String noSuchElementError(){
        return "No Such Element Found";
    }

}
