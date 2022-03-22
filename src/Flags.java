public class Flags {
    private boolean startingFlag;
    private boolean enteringFirstNum;
    private boolean enteringOperator;
    private boolean enteringSecondNum;
    private boolean enteringResultOperator;

    public Flags() {
        this.startingFlag = true;
        this.enteringFirstNum = false;
        this.enteringOperator = false;
        this.enteringSecondNum = false;
        this.enteringResultOperator = false;
    }

    public boolean isStartingFlag() {
        return startingFlag;
    }

    public boolean isEnteringFirstNum() {
        return enteringFirstNum;
    }

    public boolean isEnteringOperator() {
        return enteringOperator;
    }

    public boolean isEnteringSecondNum() {
        return enteringSecondNum;
    }

    public boolean isEnteringResultOperator() {
        return enteringResultOperator;
    }

    public void setStartingFlag() {
        this.startingFlag = true;
        this.enteringFirstNum = false;
        this.enteringOperator = false;
        this.enteringSecondNum = false;
        this.enteringResultOperator = false;
    }

    public void setEnteringFirstNum() {
        this.startingFlag = false;
        this.enteringFirstNum = true;
        this.enteringOperator = false;
        this.enteringSecondNum = false;
        this.enteringResultOperator = false;
    }

    public void setEnteringOperator() {
        this.startingFlag = false;
        this.enteringFirstNum = false;
        this.enteringOperator = true;
        this.enteringSecondNum = false;
        this.enteringResultOperator = false;
    }

    public void setEnteringSecondNum() {
        this.startingFlag = false;
        this.enteringFirstNum = false;
        this.enteringOperator = false;
        this.enteringSecondNum = true;
        this.enteringResultOperator = false;
    }

    public void setEnteringResultOperator() {
        this.startingFlag = false;
        this.enteringFirstNum = false;
        this.enteringOperator = false;
        this.enteringSecondNum = false;
        this.enteringResultOperator = true;
    }

    public void showCurrentFlags() {
        System.out.println("Starting: " + startingFlag);
        System.out.println("Entering first number: " + enteringFirstNum);
        System.out.println("Entering operator: " + enteringOperator);
        System.out.println("Entering second number: " + enteringSecondNum);
        System.out.println("Entering result operator: " + enteringResultOperator);
        System.out.println();
    }
}
