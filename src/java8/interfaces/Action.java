package java8.interfaces;

public interface Action {
    void act();

    default void reportSuccess() {
        System.out.println("Success!");
    }

    default void reportFail() {
        System.out.println("Fail!");
    }

}
