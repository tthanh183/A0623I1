package com.codegym.service.impl;

import com.codegym.model.Constant;
import com.codegym.model.Setting;
import com.codegym.service.IService;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements IService {
    private Setting setting = new Setting();
    @Override
    public List<String> getAllLanguages() {
        List<String> languages = new ArrayList<>();
        languages.add(Constant.LANGUAGE_ENGLISH);
        languages.add(Constant.LANGUAGE_VIETNAMESE);
        languages.add(Constant.LANGUAGE_JAPANESE);
        languages.add(Constant.LANGUAGE_CHINESE);
        return languages;
    }

    @Override
    public List<Integer> getAllPageSizes() {
        List<Integer> pageSizes = new ArrayList<>();
        pageSizes.add(Constant.PAGE_SIZE_5);
        pageSizes.add(Constant.PAGE_SIZE_10);
        pageSizes.add(Constant.PAGE_SIZE_15);
        pageSizes.add(Constant.PAGE_SIZE_25);
        pageSizes.add(Constant.PAGE_SIZE_50);
        pageSizes.add(Constant.PAGE_SIZE_100);
        return pageSizes;
    }

    @Override
    public void save(Setting setting) {
        this.setting = setting;
    }

    @Override
    public Setting getSetting() {
        return this.setting;
    }


}
