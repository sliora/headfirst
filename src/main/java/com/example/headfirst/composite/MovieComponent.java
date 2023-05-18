package com.example.headfirst.composite;

public abstract class MovieComponent {

    public void add(MovieComponent movieComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MovieComponent movieComponent) {
        throw new UnsupportedOperationException();
    }

    public MovieComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getTitle() {
        throw new UnsupportedOperationException();
    }

    public String getDirector() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
