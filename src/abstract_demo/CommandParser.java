package abstract_demo;

public abstract class CommandParser {
    protected abstract boolean validateParams(String[] params);

    protected abstract void process();

    public void filter(String[] params) {
        if (validateParams(params)) {
            process();
        }
    }
}
