package com.codegym.formvalidation.controller;

import com.codegym.formvalidation.model.User;
import com.codegym.formvalidation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("")
    public String showList(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "list";
    }
    @GetMapping("/create")
    public String showPageCreate(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "create";
    }
    @PostMapping("/create")
    public String addUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult,
                          RedirectAttributes redirect, Model model) {
        if (bindingResult.hasErrors()) {
            return "create";
        }
        userService.save(user);
        redirect.addFlashAttribute("message", "Add new successfully!");
        return "redirect:/users";
    }
}
