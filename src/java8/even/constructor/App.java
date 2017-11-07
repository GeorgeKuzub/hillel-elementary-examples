package java8.even.constructor;

public class App {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User userYura = userBuilder.create("Yura");
        System.out.println(userYura);
    }
}