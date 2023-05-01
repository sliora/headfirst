package com.example.headfirst.facade;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ImageUploadFacadeTest {
    @Test
    public void testUploadImage() {
        ImageUploadFacade imageUploadFacade = new ImageUploadFacade();
        String[] results = imageUploadFacade.uploadImage("example.jpg", 200, 200);

        assertThat(results[0]).isEqualTo("Uploading file: example.jpg");
        assertThat(results[1]).isEqualTo("Resizing image: example.jpg to 200x200");
        assertThat(results[2]).isEqualTo("Storing file: example.jpg");
    }
}