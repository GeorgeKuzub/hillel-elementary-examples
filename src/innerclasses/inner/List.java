package innerclasses.inner;


public class List {
    protected static int MAX = 30;
    private String[] arr = new String[MAX];
    private int top = 0;

    public void add(String value) {
        if (top == MAX) {
            return;
        }

        arr[top++] = value;
    }

    public Iterator getIterator() {
        return new Iterator();
    }

    protected class Iterator {
        protected int i = 0;

        public void next() {
            i++;
        }

        public String current() {
            return arr[i];
        }

        public boolean end() {
            if  (i == top) {
                i--;
                return true;
            }
            return false;
        }
    }

}
