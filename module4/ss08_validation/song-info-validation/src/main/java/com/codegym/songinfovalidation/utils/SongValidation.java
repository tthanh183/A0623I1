package com.codegym.songinfovalidation.utils;

import com.codegym.songinfovalidation.model.Song;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SongValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Song song = (Song) target;
        if(!song.getName().matches("^[^\\s@;,.-=+…]{1,800}$")) {
            errors.rejectValue("name", "", "The song name cannot be empty and must not exceed 800 characters!");
        }
        if(!song.getArtist().matches("^[^\\s@;,.-=+…]{1,300}$")) {
            errors.rejectValue("artist", "", "The artist cannot be empty and must not exceed 300 characters!");
        }
        if(!song.getGenre().matches("^[^!@#\\$%\\^&\\*\\(\\)\\[\\]\\{\\};:'\"<>\\/?+=|\\\\]{1,1000}$")){
            errors.rejectValue("kindOfMusic","", "Kind of music cannot be empty and must not exceed 1000 characters! Commas allowed (',')");
        }

    }
}
