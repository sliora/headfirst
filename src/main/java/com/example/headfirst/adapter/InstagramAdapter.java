package com.example.headfirst.adapter;

public class InstagramAdapter implements SocialMediaService {
    private Instagram instagram;

    public InstagramAdapter(Instagram instagram) {
        this.instagram = instagram;
    }

    @Override
    public void createPost(String content) {
        instagram.createInstagramPost(content);
    }
}
