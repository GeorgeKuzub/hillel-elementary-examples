package abstract_demo;

public class MyFileOperations extends CommandParser {
    @Override
    protected boolean validateParams(String[] params) {
        for (String param : params) {
            if (param.equalsIgnoreCase("mv") ||
                    param.equalsIgnoreCase("cp")
                    || isFilePathCorrect(param)) {

                return true;
            }
        }
        return false;
    }

    @Override
    protected void process() {

    }

    public boolean isFilePathCorrect(String str) {
        return true;
    }
}
