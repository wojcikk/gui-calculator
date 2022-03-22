import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

    // klasa tworząca przyciski, i actionListenery

public class GUIButtons implements ActionListener {

    Flags flags = new Flags();

    Operators operators = new Operators();
    Calculations calculations = new Calculations();
    ArrayList<JButton> buttons = new ArrayList<>();

    private final GUITopScreen guiTopScreen;

    public GUIButtons(GUITopScreen guiTopScreen) {
        this.guiTopScreen = guiTopScreen;
    }

    public ArrayList<JButton> getButtons() {
        JButton percentage = new JButton("%");
        JButton ce = new JButton("CE");
        JButton c = new JButton("C");
        JButton del = new JButton("DEL");
        JButton fraction = new JButton("1/x");
        JButton power = new JButton("^");
        JButton square = new JButton("_/x");
        JButton dividing = new JButton("/");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton multiplication = new JButton("x");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton subtraction = new JButton("-");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton addition = new JButton("+");
        JButton negation = new JButton("+/-");
        JButton zero = new JButton("0");
        JButton comma = new JButton(".");
        JButton equal = new JButton("=");

        buttons.add(percentage);
        buttons.add(ce);
        buttons.add(c);
        buttons.add(del);
        buttons.add(fraction);
        buttons.add(power);
        buttons.add(square);
        buttons.add(dividing);
        buttons.add(seven);
        buttons.add(eight);
        buttons.add(nine);
        buttons.add(multiplication);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(subtraction);
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(addition);
        buttons.add(negation);
        buttons.add(zero);
        buttons.add(comma);
        buttons.add(equal);

        disposeButtons();

        return buttons;
    }

    public void changeButtonShape() {
        for(int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setMargin(new Insets(0, 0, 0, 0));
            buttons.get(i).setBorderPainted(false);
        }
    }

    public void changeButtonColor(Color x) {
        for(int i = 0; i < buttons.size(); i++)
            buttons.get(i).setBackground(x);
    }

    public void changeButtonFont(Font x) {
        for(int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setFont(x);
            buttons.get(i).setForeground(new Color(100, 100, 100));
        }
    }

    public void initializeActionListener() {
        for(int i = 0; i < buttons.size(); i++)
            buttons.get(i).addActionListener(this);
    }

    public void initializeMouseListener() {
        for(int i = 0; i < buttons.size(); i++) {
            int finalI1 = i;
            buttons.get(i).getModel().addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    ButtonModel model = (ButtonModel) e.getSource();
                    if (model.isRollover()) {
                        buttons.get(finalI1).setBackground(new Color(250, 250, 250));
                    } else {
                        buttons.get(finalI1).setBackground(Color.WHITE);
                    }

                }
            });
        }
    }

    public int findByValue(String value) {
        for(int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).getText().equals(value)) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//  DIGITS
        for (Integer i = 0; i < 10; i++) {
//            doneButtons(buttons.get(findByValue(i.toString())));
            String buttonText = buttons.get(findByValue(i.toString())).getText();
            if ((flags.isStartingFlag() || flags.isEnteringFirstNum()) && e.getSource() == buttons.get(findByValue(i.toString()))) {
                calculations.addFirstNumberDigit(buttonText);
                guiTopScreen.appendCalcFieldText(buttonText);
                flags.setEnteringFirstNum();
            } else if ((flags.isEnteringOperator() || flags.isEnteringSecondNum()) && e.getSource() == buttons.get(findByValue(i.toString()))) {
                calculations.addSecondNumberDigit(buttonText);
                guiTopScreen.appendCalcFieldText(buttonText);
                flags.setEnteringSecondNum();
            }
        }

//  OPERATIONS
        //  addition
//        doneButtons(buttons.get(findByValue("+")));
        if (flags.isEnteringFirstNum() && e.getSource() == buttons.get(findByValue("+"))) {
            calculations.setOperator(operators.getAddition());
            guiTopScreen.appendCalcFieldText(" " + operators.getAddition() + " ");
            flags.setEnteringOperator();

        }

        // subtraction
//        doneButtons(buttons.get(findByValue("-")));
        if (flags.isEnteringFirstNum() && e.getSource() == buttons.get(findByValue("-"))) {
            calculations.setOperator(operators.getSubtraction());
            guiTopScreen.appendCalcFieldText(" " + operators.getSubtraction() + " ");
            flags.setEnteringOperator();
        }

        // multiplication
//        doneButtons(buttons.get(findByValue("x")));
        if (flags.isEnteringFirstNum() && e.getSource() == buttons.get(findByValue("x"))) {
            calculations.setOperator(operators.getMultiplication());
            guiTopScreen.appendCalcFieldText(" " + operators.getMultiplication() + " ");
            flags.setEnteringOperator();
        }

        // dviding
//        doneButtons(buttons.get(findByValue("/")));
        if (flags.isEnteringFirstNum() && e.getSource() == buttons.get(findByValue("/"))) {
            calculations.setOperator(operators.getDividing());
            guiTopScreen.appendCalcFieldText(" " + operators.getDividing() + " ");
            flags.setEnteringOperator();
        }

        // square
//        doneButtons(buttons.get(findByValue("_/x")));
        if (flags.isEnteringFirstNum() && e.getSource() == buttons.get(findByValue("_/x"))) {
            calculations.setOperator(operators.getSquare());
            guiTopScreen.appendCalcFieldText(" " + operators.getSquare());
            calculations.operation();
            guiTopScreen.setCalcFieldResult(calculations.getResult());
            flags.setEnteringResultOperator();
        }

        // power
//        doneButtons(buttons.get(findByValue("^")));
        if (flags.isEnteringFirstNum() && e.getSource() == buttons.get(findByValue("^"))) {
            calculations.setOperator(operators.getPower());
            guiTopScreen.appendCalcFieldText(" " + operators.getPower() + " ");
            flags.setEnteringOperator();
        }

        // negation
//        doneButtons(buttons.get(findByValue("+/-")));
        if (flags.isEnteringFirstNum() && e.getSource() == buttons.get(findByValue("+/-"))) {
            calculations.setOperator(operators.getNegation());
            guiTopScreen.appendCalcFieldText(" " + operators.getNegation());
            calculations.operation();
            guiTopScreen.setCalcFieldResult(calculations.getResult());
            flags.setEnteringResultOperator();
        }

        // fraction
//        doneButtons(buttons.get(findByValue("1/x")));
        if (flags.isEnteringFirstNum() && e.getSource() == buttons.get(findByValue("1/x"))) {
            calculations.setOperator(operators.getFraction());
            guiTopScreen.appendCalcFieldText(" " + operators.getFraction());
            calculations.operation();
            guiTopScreen.setCalcFieldResult(calculations.getResult());

            flags.setEnteringResultOperator();
        }

        // percentage
//        doneButtons(buttons.get(findByValue("%")));
        if (flags.isEnteringFirstNum() && e.getSource() == buttons.get(findByValue("%"))) {
            guiTopScreen.setCalcFieldText(calculations.getFirstNumber().toString() + operators.getPercentage());
            calculations.percentageOperation("first");
        } else if (flags.isEnteringSecondNum() && e.getSource() == buttons.get(findByValue("%"))) {
            guiTopScreen.setCalcFieldText(calculations.getFirstNumber().toString() + " " + calculations.getOperator() + " " + calculations.getSecondNumber().toString() + operators.getPercentage());
            calculations.percentageOperation("second");
        }

// ACTIONS
        //  equal
//        doneButtons(buttons.get(findByValue("=")));
        if (flags.isEnteringSecondNum() && e.getSource() == buttons.get(findByValue("="))) {
            calculations.operation();
            guiTopScreen.setCalcFieldResult(calculations.getResult());

            flags.setEnteringResultOperator();
        }

        StringBuilder firstNumber = calculations.getFirstNumber();
        String firstNumberString = calculations.getFirstNumber().toString();
        StringBuilder secondNumber = calculations.getSecondNumber();
        String secondNumberString = calculations.getSecondNumber().toString();

        // CE
//        doneButtons(buttons.get(findByValue("CE")));
        if (e.getSource() == buttons.get(findByValue("CE"))) {
            if(flags.isEnteringFirstNum()) {
                firstNumber.delete(0, firstNumber.length());
                guiTopScreen.getCalcFieldText().setText("");
                flags.setStartingFlag();

            } else if(flags.isEnteringSecondNum()) {
                secondNumber.delete(0, secondNumber.length());
                guiTopScreen.setCalcFieldText(firstNumberString + " " + calculations.getOperator() + " ");
            }
        }


        // C
//        doneButtons(buttons.get(findByValue("C")));
        if (e.getSource() == buttons.get(findByValue("C"))) {
            firstNumber.delete(0, firstNumber.length());
            secondNumber.delete(0, secondNumber.length());
            calculations.setOperator(null);
            flags.setStartingFlag();
            guiTopScreen.getCalcFieldText().setText("");
            guiTopScreen.getCalcFieldResultText().setText("");
        }

        // DEL
//        doneButtons(buttons.get(findByValue("DEL")));
        if (e.getSource() == buttons.get(findByValue("DEL"))) {
            if(flags.isEnteringFirstNum() && !firstNumberString.isEmpty()) {
                firstNumber.setLength(firstNumber.length()-1);
                guiTopScreen.getCalcFieldText().setText(firstNumber.toString());
            } else if(flags.isEnteringSecondNum() && !secondNumberString.isEmpty()) {
                secondNumber.setLength(secondNumber.length()-1);
                guiTopScreen.setCalcFieldText(firstNumber.toString() + " " + calculations.getOperator() + " " + secondNumber.toString());
            }
        }

        // COMMA
//        doneButtons(buttons.get(findByValue(".")));
        if (e.getSource() == buttons.get(findByValue("."))) {

            if (flags.isEnteringFirstNum()) {
                calculations.addFirstNumberDigit(operators.getComma());
                guiTopScreen.appendCalcFieldText(operators.getComma());
            } else if (flags.isEnteringSecondNum()) {
                calculations.addSecondNumberDigit(operators.getComma());
                guiTopScreen.appendCalcFieldText(operators.getComma());
            }
        }

        disposeButtons();
    }

//    private void doneButtons(JButton button) {
//        button.setBackground(new Color(204, 255, 204));
//    }

    private void disposeButtons() {
        if(flags.isStartingFlag()) {
            for(int i = 0; i < operators.getListOfCalculationOperators().size(); i++)
                buttons.get(findByValue(operators.getListOfCalculationOperators().get(i))).setEnabled(false);
        } else if(flags.isEnteringFirstNum()) {
            for(int i = 0; i < operators.getListOfCalculationOperators().size(); i++)
                buttons.get(findByValue(operators.getListOfCalculationOperators().get(i))).setEnabled(true);
        } else if(flags.isEnteringResultOperator()) {
            buttons.get(findByValue(operators.getCe())).setEnabled(false);
            buttons.get(findByValue(operators.getDel())).setEnabled(false);

        }
    }


}
