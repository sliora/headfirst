package com.example.headfirst.decorator;

import org.junit.jupiter.api.Test;

class PageRenderTest {

    @Test
    void 기본모드_테스트() {
        PageRender pageRender = new BasicPageRender();

        pageRender = new HeaderFooterDecorator(pageRender);
        pageRender = new TopAdsDecorator(pageRender);
        pageRender = new BottomAdsDecorator(pageRender);

        System.out.println("pageRender.renderContent() = " + pageRender.renderContent());
        System.out.println("pageRender.renderLoadingTime() = " + pageRender.renderLoadingTime());
    }

    @Test
    void 다크모드_테스트() {
        PageRender pageRender = new DarkPageRender();

        pageRender = new HeaderFooterDecorator(pageRender);
        pageRender = new TopAdsDecorator(pageRender);
        pageRender = new MiddleAdsDecorator(pageRender);
        pageRender = new BottomAdsDecorator(pageRender);

        System.out.println("pageRender.renderContent() = " + pageRender.renderContent());
        System.out.println("pageRender.renderLoadingTime() = " + pageRender.renderLoadingTime());
    }
}