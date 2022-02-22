package com.aweperi.solidprinciples.liskovsubstitution.violation;

public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendMedia() {

    }

    // Not applicable, hence violates LSP
    @Override
    public void videoCall(String... users) {

    }
}
