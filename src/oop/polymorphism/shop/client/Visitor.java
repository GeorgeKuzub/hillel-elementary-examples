package oop.polymorphism.shop.client;

import oop.polymorphism.shop.interfaces.ProductInterface;
import oop.polymorphism.shop.interfaces.VisitorInterface;

public class Visitor implements VisitorInterface {
    private String name;

    public Visitor() {
    }

    public Visitor(String name) {
        this.name = name;
    }

    @Override
    public void buy(ProductInterface goods) {
        System.out.println("Buy " + goods.getName());
    }

    @Override
    public void returnGoods(ProductInterface goods) {
        System.out.println("Coming back products is/are:" +
                goods);
    }

    @Override
    public String getName() {
        return name;
    }
}
