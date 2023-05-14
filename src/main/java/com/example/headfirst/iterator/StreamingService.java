package com.example.headfirst.iterator;

import java.util.Iterator;

public class StreamingService {
    Platform netflix;
    Platform amazonPrime;
    Platform disneyPlus;

    public StreamingService(Platform netflix, Platform amazonPrime, Platform disneyPlus) {
        this.netflix = netflix;
        this.amazonPrime = amazonPrime;
        this.disneyPlus = disneyPlus;
    }

    public void printMovie() {
        Iterator<Movie> netfilxIterator = netflix.createIterator();
        Iterator<Movie> amazonPrimeIterator = amazonPrime.createIterator();
        Iterator<Movie> disneyPlusIterator = disneyPlus.createIterator();

        printMovie(netfilxIterator);
        printMovie(amazonPrimeIterator);
        printMovie(disneyPlusIterator);
    }

    private void printMovie(Iterator iterator) {
        while (iterator.hasNext()) {
            Movie movie = (Movie) iterator.next();
            System.out.println("movie.getTitle() = " + movie.getTitle());
            System.out.println("movie.getDirector() = " + movie.getDirector());
        }
    }
}
