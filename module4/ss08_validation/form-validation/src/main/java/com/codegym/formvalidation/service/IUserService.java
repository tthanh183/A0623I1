package com.codegym.formvalidation.service;

import com.codegym.formvalidation.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    void save(User user);

}
