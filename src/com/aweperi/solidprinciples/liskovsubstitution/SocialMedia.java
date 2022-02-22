package com.aweperi.solidprinciples.liskovsubstitution;

public abstract class SocialMedia {

    //Whatsapp, Facebook, Instagram
    public abstract void chatWithFriend();

    // Facebook, Instagram, Twitter
    public abstract void publishPost(Object post);

    // Whatsapp, Facebook, Instagram
    public abstract void sendMedia();

    //Whatsapp, Facebook,
    public abstract void videoCall(String... users);
}
