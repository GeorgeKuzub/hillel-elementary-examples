package oop.polymorphism.shop.bank;

public class OilOilBank extends AbstractBank {

    public OilOilBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void giveCredit() {
        if (super.checkInfo()) {
            // we may give a credit for you
        } else {
            // sorry, but you haven't passed tax verification.
        }
    }


}
