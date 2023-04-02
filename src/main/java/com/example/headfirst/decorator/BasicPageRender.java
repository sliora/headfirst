package com.example.headfirst.decorator;

public class BasicPageRender implements PageRender {

    @Override
    public String renderContent() {
        return "\n기본모드 화면입니다.";
    }

    @Override
    public int renderLoadingTime() {
        return 10;
    }
}
