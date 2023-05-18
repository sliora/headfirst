package com.example.headfirst.composite;

public class Movie extends MovieComponent{
    private String title;
    private String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public void print() {
        System.out.print(getTitle() + ", " + getDirector());
    }
}
