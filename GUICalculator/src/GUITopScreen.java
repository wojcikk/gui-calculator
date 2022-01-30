import javax.swing.*;
import java.awt.*;

    // klasa tworzaca panel wyswietlajacy dzialania

public class GUITopScreen extends JPanel {

    public Dimension getMinimumSize() {
        return new Dimension(500, 200);
    }

    JLabel calcField;

    GUITopScreen() {

        calcField = new JLabel();


        calcField.setHorizontalAlignment(JLabel.CENTER);
        calcField.setVerticalAlignment(JLabel.CENTER);
        calcField.setFont(new Font("Calibri Light", Font.PLAIN, 25));
        this.add(calcField);
    }

    public void setCalcField(String number) {
        this.calcField.setText(number);
    }

    public JLabel getCalcField() {
        return calcField;
    }
}
