package com.example.headfirst.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Platform extends MovieComponent{

    List<MovieComponent> movieComponents = new ArrayList<>();
    String title;
    String description;

    public Platform(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public void add(MovieComponent movieComponent) {
        movieComponents.add(movieComponent);
    }

    @Override
    public void remove(MovieComponent movieComponent) {
        movieComponent.remove(movieComponent);
    }

    @Override
    public MovieComponent getChild(int i) {
        return movieComponents.get(i);
    }

    @Override
    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getTitle());
        System.out.println(", " + getDescription());
        System.out.println("----------------------");

        for (MovieComponent movieComponent : movieComponents) {
            movieComponent.print();
        }
    }
}
