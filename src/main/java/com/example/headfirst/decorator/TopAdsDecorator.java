package com.example.headfirst.decorator;

public class TopAdsDecorator extends RenderDecorator {

    public TopAdsDecorator(PageRender pageRender) {
        super(pageRender);
    }

    @Override
    public String renderContent() {
        return super.renderContent() + "\n상단 광고 영역";
    }

    @Override
    public int renderLoadingTime() {
        return super.renderLoadingTime() + 10;
    }
}
