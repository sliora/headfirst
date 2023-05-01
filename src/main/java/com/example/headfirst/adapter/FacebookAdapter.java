package com.example.headfirst.adapter;

public class FacebookAdapter implements SocialMediaService{
    private Facebook facebook;

    public FacebookAdapter(Facebook facebook) {
        this.facebook = facebook;
    }

    @Override
    public void createPost(String content) {
        facebook.createFacebookPost(content);
    }
}
