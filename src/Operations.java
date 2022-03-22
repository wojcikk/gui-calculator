public class Operations {

    public Double add(StringBuilder first, StringBuilder second) {
        Double firstNumber = Double.parseDouble(first.toString());
        Double secondNumber = Double.parseDouble(second.toString());

        return firstNumber + secondNumber;
    }

    public Double substract(StringBuilder first, StringBuilder second) {
        Double firstNumber = Double.parseDouble(first.toString());
        Double secondNumber = Double.parseDouble(second.toString());

        return firstNumber - secondNumber;
    }

    public Double multiply(StringBuilder first, StringBuilder second) {
        Double firstNumber = Double.parseDouble(first.toString());
        Double secondNumber = Double.parseDouble(second.toString());

        return firstNumber * secondNumber;
    }

    public Double divide(StringBuilder first, StringBuilder second) {
        Double firstNumber = Double.parseDouble(first.toString());
        Double secondNumber = Double.parseDouble(second.toString());

        return firstNumber / secondNumber;
    }

    public Double power(StringBuilder first, StringBuilder second) {
        Double firstNumber = Double.parseDouble(first.toString());
        Double secondNumber = Double.parseDouble(second.toString());

        return Math.pow(firstNumber, secondNumber);
    }

    public Double square(StringBuilder first) {
        Double firstNumber = Double.parseDouble(first.toString());

        return Math.sqrt(firstNumber);
    }

    public Double negation(StringBuilder first) {
        Double firstNumber = Double.parseDouble(first.toString());

        return -firstNumber;
    }

    public Double fraction(StringBuilder first) {
        Double firstNumber = Double.parseDouble(first.toString());

        return 1/firstNumber;
    }
}
