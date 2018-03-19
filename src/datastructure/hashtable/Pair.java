package datastructure.hashtable;

public class Pair {
    private final String key;
    private final Book value;


    public Pair(String key, Book value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Book getValue() {
        return value;
    }

}
