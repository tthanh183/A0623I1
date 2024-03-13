package com.codegym.blog_app.controller;

import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.model.Category;
import com.codegym.blog_app.service.IBlogService;
import com.codegym.blog_app.service.ICategoryService;
import com.codegym.blog_app.service.impl.BlogService;
import com.codegym.blog_app.utility.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String showIndexPage(Model model, @RequestParam(value = "page", defaultValue = "0") int page,
                                @RequestParam(value = "title", defaultValue = "") String title) {
        if(page < 0) {
            page = 0;
        }
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        Map<Category,Page<Blog>> map = new HashMap<>();
        for(int i = 0;i < categories.size(); i++) {
            Sort sort = Sort.by(Sort.Direction.ASC,"publicDate");
            Category category = categories.get(i);
            Page<Blog> value = blogService.findBlogByCategory(category,PageRequest.of(page,2,sort));
            map.put(category,value);
        }
        model.addAttribute("map", map);
        model.addAttribute("title", title);
        return "index";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("blog", new Blog());
        return "create";
    }
    @PostMapping("/save")
    public String createBlog(@ModelAttribute(value = "blog") Blog blog, BindingResult bindingResult, @RequestParam("file") MultipartFile multipartFile) {
        if (bindingResult.hasErrors()) {
            return "error";
        }
        String file = FileUploadUtil.uploadFile(multipartFile);
        blog.setImg(file);
        blogService.save(blog);
        return "redirect:/blog";
    }
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        List<Category> categories = categoryService.findAll();
        Optional<Blog> blog = blogService.findById(id);
        if(blog.isPresent()) {
            model.addAttribute("blog", blog.get());
            model.addAttribute("categories", categories);
            return "update";
        }else {
            String msg = "An error has occured!";
            model.addAttribute("msg", msg);
            return "index";
        }
    }
    @GetMapping("/delete/{id}")
    public String showDeleteForm(@PathVariable Long id, Model model) {
        Optional<Blog> blog = blogService.findById(id);
        if(blog.isPresent()) {
            model.addAttribute("blog", blog.get());
            return "delete";
        }else {
            String msg = "An error has occured!";
            model.addAttribute("msg", msg);
            return "index";
        }
    }
    @PostMapping("/delete")
    public String deleteBlog(@RequestParam("id") Long id, Model model) {
        Optional<Blog> blog = blogService.findById(id);
        if(blog.isPresent()) {
            blogService.delete(id);
            return "redirect:/blog";
        }else {
            String msg = "An error has occured!";
            model.addAttribute("msg", msg);
            return "index";
        }
    }
}
