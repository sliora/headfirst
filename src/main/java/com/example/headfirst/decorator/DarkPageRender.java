package com.example.headfirst.decorator;

public class DarkPageRender implements PageRender {
    @Override
    public String renderContent() {
        return "\n다크모드 화면입니다.";
    }

    @Override
    public int renderLoadingTime() {
        return 15;
    }
}
