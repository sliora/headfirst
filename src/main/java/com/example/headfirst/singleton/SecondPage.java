package com.example.headfirst.singleton;

public class SecondPage {
    private Settings settings = Settings.INSTANCE;
    public void printSettings() {
        System.out.println("settings.getFontSize() = " + settings.getFontSize());
        System.out.println("settings.isDarkMode() = " + settings.isDarkMode());
    }
}
