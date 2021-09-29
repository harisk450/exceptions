package com.example.exceptions.Service;



import com.example.exceptions.Repository.UserRepository;
import com.example.exceptions.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public List<User> getUserByName(String name) {
        return userRepository.findUserByName(name);
    }

    public User getUserById(String id) {
        return userRepository.findById(id).get();
    }
}
