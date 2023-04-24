package com.example.headfirst.singleton;

public class FirstPage {
    private Settings settings = Settings.INSTANCE;

    public void setAndPrintSettings() {
        settings.setDarkMode(true);
        settings.setFontSize(15);
        System.out.println("settings.getFontSize() = " + settings.getFontSize());
        System.out.println("settings.isDarkMode() = " + settings.isDarkMode());
    }
}
