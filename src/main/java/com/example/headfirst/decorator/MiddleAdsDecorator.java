package com.example.headfirst.decorator;

public class MiddleAdsDecorator extends RenderDecorator {
    public MiddleAdsDecorator(PageRender pageRender) {
        super(pageRender);
    }

    @Override
    public String renderContent() {
        return super.renderContent() + "\n중간 광고 영역";
    }

    @Override
    public int renderLoadingTime() {
        return super.renderLoadingTime() + 20;
    }
}
