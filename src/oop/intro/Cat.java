package oop.intro;

public class Cat extends Pet {
    private boolean canCatchMouse;

    public boolean getCanCatchMouse() {
        return canCatchMouse;
    }

    @Override
    void move() {
        System.out.println("Cat is jumping.");
    }
}
