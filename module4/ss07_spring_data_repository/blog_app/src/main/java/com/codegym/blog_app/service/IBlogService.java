package com.codegym.blog_app.service;

import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    void delete(Long id);
    Optional<Blog> findById(Long id);
    List<Blog> findBlogByCategory(Category category);
    Page<Blog> findBlogByCategory(Category category, Pageable pageable);
    Page<Blog> findBlogByCategoryAndTitle(Category category, String title, Pageable pageable);
}
