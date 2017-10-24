package innerclasses;

public class Outer {
    int localInt = -1;
    private Inner inner = new Inner();

    public Inner getInnerInst() {
        return inner;
    }

    void anonymous() {

        HelloWorld greeting1 = new HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Say: Hello!");
            }
        };


        HelloWorld greeting2 = new HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Say: Hi!");
            }
        };

        greeting1.greet();
        greeting2.greet();
        System.out.println(greeting1.getClass().getName());
        System.out.println(greeting2.getClass().getName());
    }

    protected interface HelloWorld {
        public void greet();
    }

    static class Inner {
        int localInt = 1;
        private int intInnerField = 0;
        private String strInnerField = new String();

        void someLocalMethod() {
            /* LocalSpecificClass classes are always private! */
            class LocalSpecificClass {
                /* modifiers of accessibility for fields and methods don't work */
                int localIntField = 4;
                String localStringField = "ABBA";
                int localInt = 2;

                LocalSpecificClass(Inner ref) {
                }


                @Override
                public String toString() {
                    return localStringField + ": " + String.valueOf(localIntField) + " participants.";
                }
            }

            LocalSpecificClass localSpec = new LocalSpecificClass(this);
            System.out.println("Get localInt from outer scope: " + localInt);

            int localInt = localSpec.localInt; // hidden-data
            System.out.println("Get localInt from inner scope:" + localInt);

            System.out.println(localSpec);
        }

        public int getLocalInt() {
            return localInt;
        }
    }
}