package oop.inheritance;

public enum BonusType {
    regular(50), additional(100), perfect(150);

    private int size;

    BonusType(int size) {
        this.size = size;
    }

    int getSize() {
        return size;
    }
}
