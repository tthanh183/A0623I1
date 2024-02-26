package com.codegym.controller;

import com.codegym.model.Setting;
import com.codegym.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/setting")
public class SettingController {
    private final IService service;
    @Autowired
    public SettingController(IService service){
        this.service = service;
    }
    @GetMapping("")
    public String getSetting(Model model){
        Setting setting = new Setting();
        model.addAttribute("setting", setting);
        List<String> languages = service.getAllLanguages();
        model.addAttribute("languages", languages);
        List<Integer> pageSizes = service.getAllPageSizes();
        model.addAttribute("pageSizes", pageSizes);
        return "setting";
    }
    @PostMapping("/update")
    public String updateSetting(@ModelAttribute Setting setting, Model model) {
        service.save(setting);
        model.addAttribute("setting", service.getSetting());
        return "mySetting";
    }
}
