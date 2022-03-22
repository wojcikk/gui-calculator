
    // klasa backendowa do obliczen(ktorych jeszcze nie ma, ale beda jak ogarne gui XD)

public class Calculations {
    StringBuilder firstNumber = new StringBuilder();
    int flag = 0;
    String operator;
    StringBuilder secondNumber = new StringBuilder();
    String result;
    Operators operators= new Operators();
    Operations operations = new Operations();

    public void addFirstNumberDigit(String number) {
        firstNumber.append(number);
    }

    public void addSecondNumberDigit(String number) {
        secondNumber.append(number);
    }


    public void operation() {
        if(operator.equals(operators.getAddition())) {
            setResult(operations.add(firstNumber, secondNumber).toString());
        } else if(operator.equals(operators.getSubtraction())) {
            setResult(operations.substract(firstNumber, secondNumber).toString());
        } else if(operator.equals(operators.getMultiplication())) {
            setResult(operations.multiply(firstNumber, secondNumber).toString());
        } else if(operator.equals(operators.getDividing())) {
            setResult(operations.divide(firstNumber, secondNumber).toString());
        } else if(operator.equals(operators.getSquare())) {
            setResult(operations.square(firstNumber).toString());
        } else if(operator.equals(operators.getPower())) {
            setResult(operations.power(firstNumber, secondNumber).toString());
        } else if(operator.equals(operators.getNegation())) {
            setResult(operations.negation(firstNumber).toString());
        } else if(operator.equals(operators.getFraction())) {
            setResult(operations.fraction(firstNumber).toString());
        }
    }

    public void percentageOperation(String variable) {
        if(variable.equals("first")) {
            Double number = Double.parseDouble(getFirstNumber().toString());
            number *= 0.01;
            getFirstNumber().delete(0, getFirstNumber().length());
            getFirstNumber().append(number.toString());
        } else if(variable.equals("second")) {
            Double number = Double.parseDouble(getSecondNumber().toString());
            number *= 0.01;
            getSecondNumber().delete(0, getSecondNumber().length());
            getSecondNumber().append(number.toString());
        }



    }

    public StringBuilder getFirstNumber() {
        return firstNumber;
    }

    public StringBuilder getSecondNumber() {
        return secondNumber;
    }

    public int getFlag() {
        return flag;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
