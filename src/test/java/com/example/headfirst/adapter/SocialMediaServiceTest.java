package com.example.headfirst.adapter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocialMediaServiceTest {

    @Test
    void createPost() {
        SocialMediaService facebookService = new FacebookAdapter(new Facebook());
        SocialMediaService instagramService = new InstagramAdapter(new Instagram());

        facebookService.createPost("Hello Facebook");
        instagramService.createPost("Hello Instagram");
    }
}