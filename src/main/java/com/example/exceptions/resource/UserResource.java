package com.example.exceptions.resource;



import com.example.exceptions.exception.RestrictedNameException;
import com.example.exceptions.model.User;
import com.example.exceptions.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public String noSuchElementError(){
        return "No Such Element Found";
    }


    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userName}")
    public List<User> getUserByName(@RequestParam(name = "name") String name) throws RestrictedNameException {
        if(name.equalsIgnoreCase("root")){
            throw new RestrictedNameException();
        }
        return userService.getUserByName(name);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam(name = "albumId") String id){
        userService.deleteUser(id);

    }
}
