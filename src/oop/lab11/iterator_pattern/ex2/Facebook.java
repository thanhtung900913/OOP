package oop.lab11.iterator_pattern.ex2;

public class Facebook implements SocialNetwork{
    @Override
    public FacebookIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public FacebookIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }
    public Profile[] socialGraphRequest(String profileId, String type) {
        Profile[] profiles = {
                new Profile("1", "john@example.com"),
                new Profile("2", "jane@example.com"),
        };

        return profiles;
    }
}
