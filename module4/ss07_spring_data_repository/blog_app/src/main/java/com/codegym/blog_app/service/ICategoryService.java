package com.codegym.blog_app.service;

import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();
    void save(Category category);
    void delete(Long id);
    Optional<Category> findById(Long id);
}
