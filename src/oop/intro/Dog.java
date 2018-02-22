package oop.intro;

public class Dog extends Pet {
    private boolean speciality;

    public boolean isSpeciality() {
        return speciality;
    }

    public void setSpeciality(boolean speciality) {
        this.speciality = speciality;
    }


    void move() {
        System.out.println("Dog is running");
    }

    @Override
    void voice() {
        bark();
    }

    private void bark() {
        System.out.println("Bark-Bark");
    }
}
