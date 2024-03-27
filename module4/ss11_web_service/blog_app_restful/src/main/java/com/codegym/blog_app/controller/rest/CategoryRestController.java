package com.codegym.blog_app.controller.rest;

import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.model.Category;
import com.codegym.blog_app.service.IBlogService;
import com.codegym.blog_app.service.ICategoryService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategoryRestController {
    @Autowired
    ICategoryService categoryService;
    @Autowired
    IBlogService blogService;
    @GetMapping("/categories")
    public ResponseEntity<List<Category>> showCategoryList() {
        List<Category> categories = categoryService.findAll();
        if(categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
    @GetMapping("/blogs")
    public ResponseEntity<List<Blog>> showBlogList() {
        List<Blog> blogs = blogService.findAll();
        if(blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @GetMapping("/categories/{id}/blogs")
    public ResponseEntity<List<Blog>> showBlogList(@PathVariable Long id) {
        Optional<Category> category = categoryService.findById(id);
        if(!category.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<Blog> blogs = blogService.findBlogByCategory(category.get());
        if(blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @GetMapping("/blogs/{id}")
    public ResponseEntity<Optional<Blog>> showBlog(@PathVariable Long id) {
        Optional<Blog> blog = blogService.findById(id);
        if(blog.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
