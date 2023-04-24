package com.example.headfirst.decorator;

public class BottomAdsDecorator extends RenderDecorator {
    public BottomAdsDecorator(PageRender pageRender) {
        super(pageRender);
    }

    @Override
    public String renderContent() {
        return super.renderContent() + "\n하단 광고 영역";
    }

    @Override
    public int renderLoadingTime() {
        return super.renderLoadingTime() + 10;
    }
}
