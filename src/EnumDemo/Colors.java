package EnumDemo;

/**
 * Created by User on 11.08.2017.
 */
public enum Colors {
    red('r'), yellow('y'), blue('b'), green('g');

    private char shortColor;

    Colors(char color) {
        shortColor = color;
    }

    public char getVal() {
        return shortColor;
    }
}
