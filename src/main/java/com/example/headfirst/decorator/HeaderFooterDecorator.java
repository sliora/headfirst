package com.example.headfirst.decorator;

public class HeaderFooterDecorator extends RenderDecorator {
    public HeaderFooterDecorator(PageRender pageRender) {
        super(pageRender);
    }

    @Override
    public String renderContent() {
        return addHeader() + super.renderContent() + addFooter();
    }

    @Override
    public int renderLoadingTime() {
        return super.renderLoadingTime() + 30;
    }

    private String addHeader() {
        return "\n헤더 영역 콘텐츠";
    }

    private String addFooter() {
        return "\n푸터 영역 콘텐츠";
    }
}
