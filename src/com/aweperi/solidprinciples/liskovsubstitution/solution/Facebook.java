package com.aweperi.solidprinciples.liskovsubstitution.solution;

public class Facebook implements SocialMedia, PostMediaManager, SocialVideoCallManager{
    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void chatWithFriend() {

    }

    @Override
    public void sendMedia() {

    }

    @Override
    public void makeVideoCall(String... users) {

    }
}
