import javax.swing.*;
import java.awt.*;

    // klasa tworzaca panel wyswietlajacy dzialania

public class GUITopScreen {

    JPanel calcField;
    JPanel calcFieldResult;
    JLabel calcFieldText;
    JLabel calcFieldResultText;
    JPanel panel;


    public JPanel createTopScreen() {

        panel = new JPanel();
        calcField = new JPanel();
        calcFieldResult = new JPanel();
        calcFieldText = new JLabel();
        calcFieldResultText = new JLabel();

        calcField.setMinimumSize(new Dimension(500, 70));
        calcField.setPreferredSize(new Dimension(500, 70));
        calcFieldResult.setMinimumSize(new Dimension(500, 70));
        calcFieldResult.setPreferredSize(new Dimension(500, 70));

        calcFieldText.setFont(new Font("Segoe", Font.BOLD, 50));
        calcFieldResultText.setFont(new Font("Segoe", Font.BOLD, 60));
        calcFieldText.setForeground(new Color(100, 100, 100));
        calcFieldResultText.setForeground(new Color(80, 80, 80));


        calcFieldResult.setBackground(new Color(230, 230, 230));

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        calcField.add(Box.createHorizontalGlue());
        calcField.add(calcFieldText);
        calcField.add(Box.createHorizontalGlue());


        //calcField.add(calcFieldText);
        calcFieldResult.add(calcFieldResultText);

        panel.add(calcField);
        panel.add(calcFieldResult);

        return panel;
    }

    public JLabel getCalcFieldResultText() {
        return calcFieldResultText;
    }

    public void setCalcFieldResult(String number) {
        calcFieldResultText.setText(number);
    }

    public void appendCalcFieldText(String number) {
        calcFieldText.setText(getCalcFieldText().getText() + number);
    }

    public void setCalcFieldText(String number) {
        calcFieldText.setText(number);
    }

    public JLabel getCalcFieldText() {
        return calcFieldText;
    }
}
