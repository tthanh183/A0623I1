package com.codegym.formvalidation.service.impl;

import com.codegym.formvalidation.model.User;
import com.codegym.formvalidation.repository.IUserRepository;
import com.codegym.formvalidation.service.IUserService;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
