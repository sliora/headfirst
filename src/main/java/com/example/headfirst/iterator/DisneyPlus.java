package com.example.headfirst.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class DisneyPlus implements Platform{
    ArrayList<Movie> movies;

    public DisneyPlus() {
        movies = new ArrayList<>();
        addMovie("도리를찾아서", "모름");
        addMovie("아이언맨", "모름");
        addMovie("가디언즈오브갤럭시", "모름");
    }

    public void addMovie(String title, String director) {
        Movie movie = new Movie(title, director);
        movies.add(movie);
    }

    public Iterator<Movie> createIterator() {
        return movies.iterator();
    }
}
