package com.codegym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConversionController {
    private static final double exchangeRate = 24000;
    @GetMapping("/conversion")
    public ModelAndView Convert() {
        return new ModelAndView("form");
    }
    @PostMapping("/conversion")
    public ModelAndView Convert(@RequestParam double amount) {
        double result = amount*exchangeRate;
        return new ModelAndView("form", "result",result);
    }
}
