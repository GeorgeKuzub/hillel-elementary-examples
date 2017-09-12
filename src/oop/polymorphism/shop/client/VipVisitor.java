package oop.polymorphism.shop.client;

import oop.polymorphism.shop.interfaces.ProductInterface;

public class VipVisitor extends Visitor {
    private int discount; // discount expressed in percent

    public VipVisitor(String name) {
        super(name);
    }

    public VipVisitor(String name, int discount) {
        super(name);
        this.discount = discount;
    }

    @Override
    public void buy(ProductInterface goods) {
        if (!checkDiscount()) {
            super.buy(goods);
        } else {
            // buy with discount
        }
    }

    private boolean checkDiscount() {
        return discount > 0;
    }

}
