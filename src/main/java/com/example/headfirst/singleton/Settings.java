package com.example.headfirst.singleton;

public enum Settings {
    INSTANCE;

    private boolean darkMode = false;
    private int fontSize = 13;

    public boolean isDarkMode() {
        return darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
