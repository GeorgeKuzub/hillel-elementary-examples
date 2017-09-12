package oop.polymorphism.shop.start;

import oop.polymorphism.shop.Shop;
import oop.polymorphism.shop.client.VipVisitor;
import oop.polymorphism.shop.client.Visitor;
import oop.polymorphism.shop.department.ElectronicDepartment;
import oop.polymorphism.shop.department.ToyDepartment;
import oop.polymorphism.shop.enums.ConsultResult;
import oop.polymorphism.shop.products.Chair;
import oop.polymorphism.shop.products.Mixer;
import oop.polymorphism.shop.products.TVSet;
import oop.polymorphism.shop.service.Admin;
import oop.polymorphism.shop.service.Consultant;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Admin administrator = new Admin(shop);

        ElectronicDepartment electronicDepartment = new ElectronicDepartment("Electro");
        ToyDepartment toyDepartment = new ToyDepartment("Toys");

        shop.addDepartment(electronicDepartment);
        shop.addDepartment(toyDepartment);

        Consultant consultant1 = new Consultant("John Doe");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Natasha");

        electronicDepartment.addEmployee(consultant1);
        electronicDepartment.addEmployee(consultant2);

        Mixer mixer = new Mixer("Mixer super machine", true, 800, "Braunn");
        TVSet tvSet = new TVSet("Zamzund", 101);
        Chair simpleChair1 = new Chair("SuperbChair");

        electronicDepartment.addProduct(mixer);
        electronicDepartment.addProduct(tvSet);
        toyDepartment.addProduct(simpleChair1);

        Visitor visitor1 = new Visitor("Ivan");
        VipVisitor vipVisitor1 = new VipVisitor("Vasiliy", 30);


        Consultant consultant = administrator.getFreeConsultant(electronicDepartment);
        if (consultant != null) {
            ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(visitor1);

            switch (consultResult) {
                case BUY:
                    electronicDepartment.checkProduct(tvSet);
                    visitor1.buy(tvSet);
                    break;
                case LEAVE:
                    System.out.println("The customer lost interest.");
                    break;
            }
        } else {
            System.out.println("All consultants are busy, please, repeat purchasing later.");
        }
    }
}
