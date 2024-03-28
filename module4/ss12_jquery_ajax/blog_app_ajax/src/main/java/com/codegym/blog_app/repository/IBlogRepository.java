package com.codegym.blog_app.repository;

import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IBlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findBlogByCategory(Category category);
    Page<Blog> findBlogByCategory(Category category, Pageable pageable);
    Page<Blog> findBlogByCategoryAndTitleContainingIgnoreCase(Category category, String title,Pageable pageable);

    List<Blog> findBlogByCategoryAndTitleContainingIgnoreCase(Category category, String title);
}
