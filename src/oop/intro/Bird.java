package oop.intro;

public class Bird extends Pet {

    private boolean canSpeak;

    public boolean isCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    @Override
    public void move() {
        System.out.println("The bird is flying.");
    }

}
