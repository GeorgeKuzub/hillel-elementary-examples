package datastructure.hashtable;

public class Pair {
    private final String key;
    private final Book value;
    private boolean deleted;


    public Pair(String key, Book value) {
        this.key = key;
        this.value = value;
        this.deleted = false;
    }

    public String getKey() {
        return key;
    }

    public Book getValue() {
        return value;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public boolean deletePair() {
        if (!this.deleted) {
            this.deleted = true;
            return true;
        } else {
            return false;
        }
    }
}
