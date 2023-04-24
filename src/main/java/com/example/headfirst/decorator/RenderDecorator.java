package com.example.headfirst.decorator;

public abstract class RenderDecorator implements PageRender {
    protected PageRender pageRender;

    public RenderDecorator(PageRender pageRender) {
        this.pageRender = pageRender;
    }

    @Override
    public String renderContent() {
        return pageRender.renderContent();
    }

    @Override
    public int renderLoadingTime() {
        return pageRender.renderLoadingTime();
    }
}
