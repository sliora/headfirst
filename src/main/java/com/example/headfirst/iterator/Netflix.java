package com.example.headfirst.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Netflix {
    List<Movie> movies;

    public Netflix() {
        movies = new ArrayList<Movie>();

        addMovie("택배기사", "모름");
        addMovie("더글로리", "모름");
        addMovie("스파이패밀리", "모름");
    }

    public void addMovie(String title, String director) {
        Movie movie = new Movie(title, director);
        movies.add(movie);
    }

    public Iterator createIterator() {
        return movies.iterator();
    }
}
