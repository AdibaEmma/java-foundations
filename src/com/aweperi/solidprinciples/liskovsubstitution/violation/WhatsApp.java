package com.aweperi.solidprinciples.liskovsubstitution.violation;

public class WhatsApp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    // Not applicable, hence violates Liskov substitution
    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendMedia() {

    }

    @Override
    public void makeVideoCall(String... users) {

    }
}
