package com.codegym.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService {
    private static Map<String, String> diction = new HashMap<>();
    static {
        diction.put("Spring", "Mùa xuân");
        diction.put("Summer", "Mùa hè");
        diction.put("Autumn", "Mùa thu");
        diction.put("Winter", "Mùa đông");
    }

    public String lookUp(String key) {
        return diction.get(key);
    }
}
