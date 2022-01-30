import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

    // klasa tworząca przyciski, i actionListenery

public class GUIButtons implements ActionListener {

    Calculations calculations = new Calculations();

    private final GUITopScreen guiTopScreen;

    ArrayList<JButton> buttons = new ArrayList<>();

    public GUIButtons(GUITopScreen guiTopScreen) {
        this.guiTopScreen = guiTopScreen;
    }

    public ArrayList getButtons() {

        JButton percentage = new JButton("%");
        JButton ce = new JButton("CE");
        JButton c = new JButton("C");
        JButton del = new JButton("DEL");
        JButton fraction = new JButton("1/x");
        JButton power = new JButton("x^2");
        JButton square = new JButton("_/x");
        JButton dividing = new JButton("'/,");
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
        JButton comma = new JButton(",");
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

        return buttons;
    }

    public void changeButtonColor(Color x) {
        for(int i = 0; i < buttons.size(); i++)
            buttons.get(i).setBackground(x);
    }

    public void changeButtonFont(Font x) {
        for(int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setFont(x);
            buttons.get(i).setMargin(new Insets(0, 0, 0, 0));
        }
    }

    public void initializeActionListener() {
        for(int i = 0; i < buttons.size(); i++)
            buttons.get(i).addActionListener(this);
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
        if(e.getSource() == buttons.get(findByValue("1"))) {
            calculations.addDigit(buttons.get(findByValue("1")).getText());
            guiTopScreen.setCalcField(calculations.getFirstNumber().toString());
            System.out.println(guiTopScreen.getCalcField().getText());
        }
    }
}
