package multiple_inheritance;

public class SuperCalc {
    private BaseCalc baseCalc;
    private ExtCalc extCalc;


    public SuperCalc(BaseCalc baseCalc, ExtCalc extCalc) {
        this.baseCalc = baseCalc;
        this.extCalc = extCalc;
    }

    public int add() {

        return baseCalc.add();
    }

    public int sub() {
        return baseCalc.sub();
    }


    public int div() {
        return extCalc.div();
    }

    public int mul() {
        return extCalc.mul();
    }

    public int power() {
        return baseCalc.power();
    }

}
