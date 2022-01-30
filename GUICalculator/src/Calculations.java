
    // klasa backendowa do obliczen(ktorych jeszcze nie ma, ale beda jak ogarne gui XD)

public class Calculations {
    StringBuilder firstNumber = new StringBuilder();


    public void addDigit(String number) {
        firstNumber.append(number);
    }

    public StringBuilder getFirstNumber() {
        return firstNumber;
    }
}
