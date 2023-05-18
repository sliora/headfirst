package com.example.headfirst.composite;

import java.util.Iterator;
import java.util.List;

public class StreamingService {
    MovieComponent movieComponent;

    public StreamingService(MovieComponent movieComponent) {
        this.movieComponent = movieComponent;
    }

    public void printMovie() {
        movieComponent.print();
    }
}
