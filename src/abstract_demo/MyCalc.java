package abstract_demo;

public  class MyCalc extends CommandParser {
    private String[] parameters;

    public MyCalc(String[] parameters) {
        this.parameters  = parameters;
    }

    @Override
    protected boolean validateParams(String[] params) {
        for (String param : params) {
            if (param.equalsIgnoreCase("a") ||
                    param.equalsIgnoreCase("s")
                    || param.equalsIgnoreCase("d")
                    || param.equalsIgnoreCase("m")
                    || isNumber(param)) {

                return true;
            }
        }
        return false;
    }

    protected  void process() {
        System.out.println("Calc -- ");
    }

    private boolean isNumber(String str) {
        // code must be here
        return true;
    }
}
