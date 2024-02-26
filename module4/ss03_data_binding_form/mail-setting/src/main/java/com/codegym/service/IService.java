package com.codegym.service;

import com.codegym.model.Setting;

import java.util.List;

public interface IService {
    List<String> getAllLanguages();
    List<Integer> getAllPageSizes();
    void save(Setting setting);
    Setting getSetting();
}
