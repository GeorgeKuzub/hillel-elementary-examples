package oop.inheritance;

import java.util.Random;


public class President extends Employee {
    private BonusType bonusType;

    President(String name) {
        super(name, 1_000_000L, 2000, 01, 01);
    }

    void annulYearReport() {
        System.out.println();
        System.out.println("--------- Begin Financial CEO's Annual Report ------ ");
        System.out.println("The first quarter was very successful and we raised our revenues by 200 percent");
        System.out.println("The second quarter was successful and we raised our revenues by 100 percent");
        System.out.println("In the third quarter, we lost 50 percent of our revenue. The investigation being started.");
        System.out.println("In the fourth quarter we received the maximum revenue for all the years of our work, " +
                "which amounted over then 500 percent.");
        System.out.println();
        System.out.println("--------- End of Financial CEO's Annual Report ------ ");
    }

    void letVacation(Employee emp) {
        emp.setVacation(true);
    }

    void fire(Employee employee) {
        employee.setFired();
    }

    void letBonusToSalary(Employee employee) {
        int empBonus = getRandomBonus();
        employee.setBonusSalary(empBonus);
    }

    private int getRandomBonus() {
        int bonusIntChoice = new Random().nextInt(2);
        int bonusSize = 0;
        switch (bonusIntChoice) {
            case 0: {
                bonusSize = bonusType.regular.getSize();
                break;
            }

            case 1: {
                bonusSize = bonusType.additional.getSize();
                break;
            }

            case 2: {
                bonusSize = bonusType.perfect.getSize();
                break;
            }
        }
        return bonusSize;
    }
}
