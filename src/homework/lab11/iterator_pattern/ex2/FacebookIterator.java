package homework.lab11.iterator_pattern.ex2;

public class FacebookIterator implements ProfileIterator{
    private Facebook facebook;
    private String profileId;
    private String type;
    private int currentPosition;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }
    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }
    private Profile[] loadProfilesFromFacebook(String profileId, String type) {
        return new Profile[]{};
    }

    @Override
    public Profile getNext() {
        if (hasMore()) {
            currentPosition++;
            return cache[currentPosition - 1];
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length;
    }
}
