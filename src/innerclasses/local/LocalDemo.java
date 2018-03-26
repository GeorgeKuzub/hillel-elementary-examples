package innerclasses.local;

public class LocalDemo {


    public Pair getPair() {
        class LocalPair implements Pair {
            String name;
            int data;

             public LocalPair(String name, int data) {
                this.name = name;
                this.data = data;
            }

            public String getName() {
                return name;
            }

            public int getData() {
                return data;
            }
        }

        LocalPair pair =
                new LocalPair("UUU", 100);

        return pair;
    }


    public void handle(boolean param) {

        if (param) {
            class Task {
                private int parametr;

                public Task(int parametr) {
                    this.parametr = parametr;
                }

                public void waitingFor() {
                    System.out.println(parametr);
                }
            }
            new Task(100).waitingFor();
        } else {
        }

    }


}
