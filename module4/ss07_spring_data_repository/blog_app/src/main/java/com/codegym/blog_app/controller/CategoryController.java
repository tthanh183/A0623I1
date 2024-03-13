package com.codegym.blog_app.controller;


import com.codegym.blog_app.model.Blog;
import com.codegym.blog_app.model.Category;
import com.codegym.blog_app.service.ICategoryService;
import com.codegym.blog_app.utility.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;
    @GetMapping("")
    public String showCategoryList(Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "category-list";
    }
    @GetMapping("/create")
    public String showCreateList(Model model) {
        model.addAttribute("category", new Category());
        return "category-create";
    }
    @PostMapping("/create")
    public String createCategory(@ModelAttribute("category") Category category, BindingResult bindingResult,  Model model) {
        if (bindingResult.hasErrors()) {
            return "error";
        }
        categoryService.save(category);
        return "redirect:/category";
    }
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Optional<Category> category = categoryService.findById(id);
        if(category.isPresent()) {
            model.addAttribute("category", category.get());
            return "category-update";
        }else {
            String msg = "An error has occured!";
            model.addAttribute("msg", msg);
            return "category-list";
        }
    }
    @GetMapping("/delete/{id}")
    public String showDeleteForm(@PathVariable Long id, Model model) {
        Optional<Category> category = categoryService.findById(id);
        if(category.isPresent()) {
            model.addAttribute("category", category.get());
            return "category-delete";
        }else {
            String msg = "An error has occured!";
            model.addAttribute("msg", msg);
            return "category-list";
        }
    }
    @PostMapping("/delete")
    public String deleteBlog(@RequestParam("id") Long id, Model model) {
        Optional<Category> category = categoryService.findById(id);
        if(category.isPresent()) {
            categoryService.delete(id);
            return "redirect:/category";
        }else {
            String msg = "An error has occured!";
            model.addAttribute("msg", msg);
            return "category-list";
        }
    }
}
