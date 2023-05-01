package com.example.headfirst.facade;

public class ImageResizer {
    public String resize(String imagePath, int width, int height) {
        return "Resizing image: " + imagePath + " to " + width + "x" + height;
    }
}
