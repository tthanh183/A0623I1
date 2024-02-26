package com.codegym.model;

public class Setting {
    private String language;
    private int pageSizes;
    private boolean spamFilter;
    private String signature;

    public Setting() {
        this.language = Constant.LANGUAGE_ENGLISH;
        this.pageSizes = Constant.PAGE_SIZE_25;
        this.spamFilter = false;
        this.signature = "";
    }

    public Setting(String language, int pageSizes, boolean spamFilter, String signature) {
        this.language = language;
        this.pageSizes = pageSizes;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSizes() {
        return pageSizes;
    }

    public void setPageSizes(int pageSizes) {
        this.pageSizes = pageSizes;
    }

    public boolean isSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void change(Setting setting) {
        this.language = setting.getLanguage();
        this.pageSizes = setting.getPageSizes();
        this.spamFilter = setting.isSpamFilter();
        this.signature = setting.getSignature();
    }
}
