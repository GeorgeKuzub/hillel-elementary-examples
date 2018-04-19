package generics.pecs;

public class OldPhone extends Product implements SomeInterface1, SomeInterface2 {
    public OldPhone(String name, long price) {
        super(name, price);
    }
}
