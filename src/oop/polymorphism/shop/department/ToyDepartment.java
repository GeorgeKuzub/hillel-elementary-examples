package oop.polymorphism.shop.department;

import oop.polymorphism.shop.Helper;
import oop.polymorphism.shop.products.AbstractProduct;

public class ToyDepartment extends AbstractDepartment {
    public ToyDepartment(String name) {
        super(name);
    }

    @Override
    public void checkProduct(AbstractProduct abstractProduct) {
        if (Helper.getChoice()) {
            System.out.println("The Product is fully workable.");
        } else {
            System.out.println("The Product isn't fully workable. Please, try again or return it again to the shop.");
        }
    }
}
