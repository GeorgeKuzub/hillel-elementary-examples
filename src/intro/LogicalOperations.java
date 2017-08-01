package intro;

public class LogicalOperations {
    boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, that's why returns true
    boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, that's why returns false
    boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, 4 < 6 - true, that's why returns false
    boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, that's why returns true
    boolean a5 = (5 > 6) ^ (4 < 6); // 5 > 6 - false, 4 < 6 - true, that's why returns true
    boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, that's why returns false


    boolean s1;
    boolean s2;

    boolean a7 = (s1 = 1 > 4) & (s2 = 1 < 100); // returns false

    boolean a8 = (1 > 4) | (1 < 100); // returns true


}
