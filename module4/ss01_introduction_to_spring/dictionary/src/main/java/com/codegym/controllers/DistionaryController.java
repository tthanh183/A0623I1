package com.codegym.controllers;

import com.codegym.services.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DistionaryController {
    @Autowired
    DictionaryService dictionaryService;

    @GetMapping("/diction")
    public ModelAndView createForm(@RequestParam int val) {
        return new ModelAndView("form");
    }
    @PostMapping("/diction")
    public ModelAndView search(@RequestParam String key){
        String result = dictionaryService.lookUp(key);
        return new ModelAndView("form", "result",result);
    }
}
