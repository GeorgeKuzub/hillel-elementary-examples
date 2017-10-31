package generics.wildcards;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "[ID: " + id + "]";
    }

    public String getId() {
        return String.valueOf(id);
    }
}
