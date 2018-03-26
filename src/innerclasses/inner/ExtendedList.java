package innerclasses.inner;

public class ExtendedList extends List {

    /** Since List.Iterator is defined as protected so why we can't derived from it
     * and create additional functionality for iterator
     * that let moving back during iteration cycle
     */
    class BiIterator extends List.Iterator {

        public boolean begin() {
            if (i < 0) {
                i = 0;
                return true;
            }
            return false;
        }

        public void prev() {
            i--;
        }
    }

    @Override
    public BiIterator getIterator() {
        return new BiIterator();
    }
}
