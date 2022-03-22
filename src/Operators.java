import java.util.ArrayList;

public class Operators {
    private final String addition;
    private final String subtraction;
    private final String multiplication;
    private final String dividing;
    private final String power;
    private final String square;
    private final String percentage;
    private final String fraction;
    private final String negation;
    private final String comma;
    private final String equals;
    private final String ce;
    private final String c;
    private final String del;

    ArrayList<String> listOfCalculationOperators;

    public Operators() {
        this.addition = "+";
        this.subtraction = "-";
        this.multiplication = "x";
        this.dividing = "/";
        this.power = "^";
        this.square = "_/x";
        this.percentage = "%";
        this.fraction = "1/x";
        this.negation = "+/-";
        this.equals = "=";
        this.comma = ".";
        this.ce = "CE";
        this.c = "C";
        this.del = "DEL";

        this.listOfCalculationOperators = createOperatorsList();
    }

    private ArrayList<String> createOperatorsList() {
        ArrayList<String> temp = new ArrayList<>();
        temp.add(addition);
        temp.add(subtraction);
        temp.add(multiplication);
        temp.add(dividing);
        temp.add(power);
        temp.add(square);
        temp.add(percentage);
        temp.add(fraction);
        temp.add(negation);
        temp.add(equals);
        temp.add(comma);
        temp.add(ce);
        temp.add(c);
        temp.add(del);
        return temp;
    }

    public String getAddition() {
        return addition;
    }

    public String getSubtraction() {
        return subtraction;
    }

    public String getMultiplication() {
        return multiplication;
    }

    public String getDividing() {
        return dividing;
    }

    public String getPower() {
        return power;
    }

    public String getSquare() {
        return square;
    }

    public String getPercentage() {
        return percentage;
    }

    public String getFraction() {
        return fraction;
    }

    public String getNegation() {
        return negation;
    }

    public String getComma() {
        return comma;
    }

    public String getEquals() {
        return equals;
    }

    public String getCe() {
        return ce;
    }

    public String getC() {
        return c;
    }

    public String getDel() {
        return del;
    }

    public ArrayList<String> getListOfCalculationOperators() {
        return listOfCalculationOperators;
    }
}
