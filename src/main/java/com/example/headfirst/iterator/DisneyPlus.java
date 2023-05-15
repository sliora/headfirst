package com.example.headfirst.iterator;

import java.util.*;

public class DisneyPlus implements Platform{
    Queue<Movie> movies;

    public DisneyPlus() {
        movies = new LinkedList<>();
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
