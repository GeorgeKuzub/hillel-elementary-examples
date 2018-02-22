package EnumDemo;

/**
 * Created by User on 11.08.2017.
 */
public enum Colors {
    red("Beauty Red Color", 0),
    yellow("Beauty Yellow Color", 1),
    blue("BLUE BLUE AND BLUE", 2),
    green("GREEN Grass", 3);

    private String shortColor;
    private int code;

    Colors(String color, int code) {

        this.shortColor = color;
        this.code = code;
    }

    public String getVal() {
        return shortColor;
    }

    public int getCode() {
        return code;
    }
}
