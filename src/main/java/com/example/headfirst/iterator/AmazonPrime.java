package com.example.headfirst.iterator;

import java.util.*;
import java.util.Iterator;

public class AmazonPrime implements Platform{
    List<Movie> movies;

    public AmazonPrime() {
        movies = new ArrayList<>();
        addMovie("아마존1", "모름");
        addMovie("아마존2", "모름");
        addMovie("아마존3", "모름");
    }

    public void addMovie(String title, String director) {
        Movie movie = new Movie(title, director);
        movies.add(movie);
    }

    public Iterator<Movie> createIterator() {
        return movies.iterator();
    }
}
