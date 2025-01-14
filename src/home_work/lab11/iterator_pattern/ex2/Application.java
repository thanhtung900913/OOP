package home_work.lab11.iterator_pattern.ex2;

class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;

    public Application(SocialNetwork network) {
        this.network = network;
        this.spammer = new SocialSpammer(network);
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }


    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }
}