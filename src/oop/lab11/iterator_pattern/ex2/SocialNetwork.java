package oop.lab11.iterator_pattern.ex2;

public interface SocialNetwork {
    FacebookIterator createFriendsIterator(String profileId);
    FacebookIterator createCoworkersIterator(String profileId);
}
