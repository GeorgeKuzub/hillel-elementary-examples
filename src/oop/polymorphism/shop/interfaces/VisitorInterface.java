package oop.polymorphism.shop.interfaces;

public interface VisitorInterface {
    void buy(ProductInterface goods);

    void returnGoods(ProductInterface goods);

    String getName();
}
