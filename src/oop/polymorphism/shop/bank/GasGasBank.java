package oop.polymorphism.shop.bank;

import oop.polymorphism.shop.Helper;

public class GasGasBank extends AbstractBank {

    public GasGasBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void giveCredit() {
        if (checkInfo()) {
            // we may give a credit for you
        } else {
            // sorry, but you haven't passed tax or/and our verifications.
        }
    }

    @Override
    public boolean checkInfo() {
        boolean taxConclusion = super.checkInfo();

        // Here we may do some banks' additional verifications
        boolean internalBankConclusion =
                Helper.getChoice();

        return taxConclusion && internalBankConclusion;
    }

}
