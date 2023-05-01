package com.example.headfirst.decorator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PageRenderTest {

    @Test
    void 기본모드_테스트() {
        PageRender pageRender = new BasicPageRender();

        pageRender = new HeaderFooterDecorator(pageRender);
        pageRender = new TopAdsDecorator(pageRender);
        pageRender = new BottomAdsDecorator(pageRender);

        Assertions.assertThat(pageRender.renderLoadingTime()).isEqualTo(60);
    }

    @Test
    void Light모드_테스트() {
        PageRender pageRender = new LightPageRender();

        Assertions.assertThat(pageRender.renderContent()).isEqualTo("\nLight 모드 화면입니다.");
        Assertions.assertThat(pageRender.renderLoadingTime()).isEqualTo(15);
    }

    @Test
    void 다크모드_테스트() {
        PageRender pageRender = new DarkPageRender();

        pageRender = new HeaderFooterDecorator(pageRender);
        pageRender = new TopAdsDecorator(pageRender);
        pageRender = new MiddleAdsDecorator(pageRender);
        pageRender = new BottomAdsDecorator(pageRender);

        Assertions.assertThat(pageRender.renderLoadingTime()).isEqualTo(85);
    }

    @Test
    void 체인_테스트() {
        PageRender pageRender = new DarkPageRender();

        pageRender = new HeaderFooterDecorator(new TopAdsDecorator( new MiddleAdsDecorator( new BottomAdsDecorator(pageRender))));

        Assertions.assertThat(pageRender.renderLoadingTime()).isEqualTo(85);
    }
}