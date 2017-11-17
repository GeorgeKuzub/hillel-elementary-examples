package patterns;

import patterns.abstractfabric.Door;
import patterns.abstractfabric.DoorFittingExpert;
import patterns.abstractfabric.WoodenDoorFactory;

public class Patterns {

    public static void main(String[] args) {
//        Door myDoorBathRoom = DoorFactory.makeDoor(10, 20);
//        Door myDoorBedRoom = DoorFactory.makeDoor(10, 20);

        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();

        Door door = woodenDoorFactory.makeDoor();
        DoorFittingExpert woodDoorExpert = woodenDoorFactory.makeFittingExpert();

        door.getDescription();  // Output: Я деревянная дверь
        woodDoorExpert.getDescription(); // Output: Я могу устанавливать только деревянные двери

// Same for Iron Factory


    }
}
