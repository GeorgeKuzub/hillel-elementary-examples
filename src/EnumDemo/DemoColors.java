package EnumDemo;

/**
 * Created by User on 11.08.2017.
 */
public class DemoColors {
    public static void main(String[] args) {
        Colors red = Colors.red;
        Colors yellow = Colors.yellow;
        Colors blue = Colors.blue;
        Colors green = Colors.green;

        System.out.println(
                "Associated data to green constant is: "
                        + Colors.green.getVal());


        Colors[] arrColors = Colors.values();
        for (Colors color : arrColors) {
            System.out.print(color +" [" + color.getVal() + "] ; ");
        }
        System.out.println();
        System.out.println("The ordinal number for blue is :" + blue.ordinal());
    }
}
