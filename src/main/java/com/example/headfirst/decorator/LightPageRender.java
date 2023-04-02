package com.example.headfirst.decorator;

public class LightPageRender implements PageRender {
    @Override
    public String renderContent() {
        return "\nLight 모드 화면입니다.";
    }

    @Override
    public int renderLoadingTime() {
        return 15;
    }
}
