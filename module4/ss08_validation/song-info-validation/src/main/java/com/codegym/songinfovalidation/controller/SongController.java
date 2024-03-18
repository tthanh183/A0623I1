package com.codegym.songinfovalidation.controller;

import com.codegym.songinfovalidation.model.Song;
import com.codegym.songinfovalidation.service.ISongService;
import com.codegym.songinfovalidation.utils.SongValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("")
    public String showList(Model model){
        List<Song> songs = songService.findALl();
        model.addAttribute("songs", songs);
        return"list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("song", new Song());
        return "create";
    }

    @PostMapping("save")
    public String saveMusic(@ModelAttribute(name = "song") Song song, BindingResult bindingResult,
                            RedirectAttributes redirect, Model model){
        new SongValidation().validate(song,bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute(song);
            return "create";
        }
        songService.save(song);
        redirect.addFlashAttribute("message", "Add new successfully!");
        return "redirect:/songs";
    }
}
