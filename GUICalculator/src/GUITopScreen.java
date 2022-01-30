import javax.swing.*;
import java.awt.*;

    // klasa tworzaca panel wyswietlajacy dzialania

public class GUITopScreen {

    public Dimension getMinimumSize() {
        return new Dimension(500, 200);
    }

    JLabel calcField = new JLabel("123");;
    JPanel panel = new JPanel();

    public JPanel createTopScreen() {

        calcField.setFont(new Font("Calibri Light", Font.PLAIN, 25));
        panel.add(calcField);

        return panel;
    }

    public void setCalcField(String number) {
        calcField.setText(number);
    }

    public JLabel getCalcField() {
        return calcField;
    }
}
