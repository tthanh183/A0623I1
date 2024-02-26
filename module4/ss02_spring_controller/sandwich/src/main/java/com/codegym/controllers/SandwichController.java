package com.codegym.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class SandwichController {
    private static final List<String> CONDIMENTS = Arrays.asList("Lettuce", "Tomato", "Mustard", "Sprouts");

    @GetMapping("/sandwich")
    public String showMenu(Model model) {
        model.addAttribute("condiments", CONDIMENTS);
        return "sandwich-form";
    }

    @PostMapping("/sandwich")
    public String showList(@RequestParam(value = "selectedCondiments") List<String> condiments, Model model) {
        if(condiments != null) {
            model.addAttribute("selectedCondiments",condiments);
        }
        return "sandwich-result";
    }

}
