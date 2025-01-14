package homework.lab11.iterator_pattern.ex2;

public class SocialSpammer {
    private SocialNetwork network;
    private ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println(profile.getEmail()+": "+message);
        }
    }
}
