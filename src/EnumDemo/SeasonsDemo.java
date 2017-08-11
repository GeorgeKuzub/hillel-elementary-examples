package EnumDemo;

public class SeasonsDemo {
    public static void main(String[] args) {
        Season autumn = Season.Autumn;
        Season spring = Season.Spring;
        Season summer = Season.Summer;
        Season winter = Season.Winter;

        showAllSeasons();

        if (autumn != spring) {
            System.out.println("\n 'autumn' and 'spring' moths are different months");
        } else {
            System.out.println("If you can see this message it means a very strange situation since 'autumn' can be equal to 'spring'.");
        }

        String strSummer = "Summer";
        Season summer2 = Season.valueOf(strSummer);

        System.out.println("summer2 is equal: " + summer2);

        showAllOrdinals();
        showCodeEachSeason();

    }

    private static void showAllSeasons() {
        System.out.println();
        Season[] arrSeasons = Season.values();
        for (Season season : arrSeasons) {
            System.out.print(season + "; ");
        }
    }

    private static void showAllOrdinals() {
        System.out.println();
        for (Season season : Season.values()) {
            System.out.print("For season " + season + " its ordinal number: " + season.ordinal() + "\n");
        }
    }

    private static void showCodeEachSeason() {
        System.out.println();
        for (Season season : Season.values()) {
            System.out.print("For season " + season + " its russian code number: " + season.getCodeOfSeason() + "\n");
        }
    }

    public enum Season {
        Winter("Зима"), Spring("Весна"), Autumn("Осень"), Summer("Лето");

        private String code;

        Season(String str) {
            code = str;
        }

        String getCodeOfSeason() {
            return code;
        }
    }

}
