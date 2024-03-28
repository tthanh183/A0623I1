package com.codegym.blog_app.service.impl;

import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.model.Category;
import com.codegym.blog_app.repository.IBlogRepository;
import com.codegym.blog_app.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }


    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public List<Blog> findBlogByCategory(Category category) {
        return blogRepository.findBlogByCategory(category);
    }

    @Override
    public Page<Blog> findBlogByCategory(Category category, Pageable pageable) {
        return blogRepository.findBlogByCategory(category,pageable);
    }

    @Override
    public Page<Blog> findBlogByCategoryAndTitleContainingIgnoreCase(Category category, String title, Pageable pageable) {
        return blogRepository.findBlogByCategoryAndTitleContainingIgnoreCase(category,title,pageable);
    }

    @Override
    public List<Blog> findBlogByCategoryAndTitleContainingIgnoreCase(Category category, String title) {
        return blogRepository.findBlogByCategoryAndTitleContainingIgnoreCase(category, title);
    }
}
