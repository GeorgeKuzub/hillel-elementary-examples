package oop.polymorphism.shop.department;

import oop.polymorphism.shop.interfaces.ElectronicDeviceInterface;
import oop.polymorphism.shop.products.AbstractProduct;

public class ElectronicDepartment extends AbstractDepartment {

    public ElectronicDepartment(String name) {
        super(name);
    }

    @Override
    public void checkProduct(AbstractProduct device) {
        if (device instanceof ElectronicDeviceInterface) {
            if (new ElectronicTestingTable((ElectronicDeviceInterface) device).check()) {
                System.out.println("The Product " + device.getName() + " is an electronic device and it works very nice! ");
            } else {
                System.out.println("The Product is an electronic device and it doesn't work normally! ");
            }
        } else {
            System.out.println("The Product(device) doesn't fit to electronic device and it cannnot be checked on Electronic Testing Table.");
        }
    }

}
