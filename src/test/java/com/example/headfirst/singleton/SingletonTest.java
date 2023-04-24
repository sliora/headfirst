package com.example.headfirst.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    private Settings settings = Settings.INSTANCE;

    @Test
    void testSingletonSettings() {
        new FirstPage().setAndPrintSettings();
        new SecondPage().printSettings();

        Assertions.assertThat(settings.getFontSize()).isEqualTo(15);
        Assertions.assertThat(settings.isDarkMode()).isTrue();
    }
}