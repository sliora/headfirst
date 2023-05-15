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

        System.out.println("[상영목록]\n----\n넷플릭스");
        printMovie(netfilxIterator);
        System.out.println("\n아마존 프라임");
        printMovie(amazonPrimeIterator);
        System.out.println("\n디즈니 플러스");
        printMovie(disneyPlusIterator);
    }

    private void printMovie(Iterator iterator) {
        while (iterator.hasNext()) {
            Movie movie = (Movie) iterator.next();
            System.out.print(movie.getTitle() + ", ");
            System.out.println(movie.getDirector());
        }
    }
}
