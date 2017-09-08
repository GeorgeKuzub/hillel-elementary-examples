package oop.polymorphism.shop.models;

import oop.polymorphism.shop.interfaces.GoodsInterface;
import oop.polymorphism.shop.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface {
    private String name;

    public AbstractVisitor(String name) {
        this.name = name;
    }

    @Override
    public void buy(GoodsInterface goods) {
        //
    }

    @Override
    public void returnGoods(GoodsInterface goods) {
        //
    }

    @Override
    public String getName() {
        return name;
    }
}
