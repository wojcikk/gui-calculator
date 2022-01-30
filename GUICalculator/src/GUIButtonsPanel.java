import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

    // klasa, która reprezentuje panel klawiatury,
    // posiada klasę, która inicjalizuje konkretne przyciski

public class GUIButtonsPanel  {

    public Dimension getMinimumSize() {
        return new Dimension(500, 500);
    }

    JPanel panel = new JPanel();

    public JPanel createMainContainer() {

        panel.setLayout(new GridLayout(6, 4, 0, 0));

        GUIButtons buttonClass = new GUIButtons();
        ArrayList<JButton> buttons = buttonClass.getButtons();


        for(int i = 0; i < buttons.size(); i++)
            panel.add(buttons.get(i));

        buttonClass.changeButtonColor(Color.white);
        buttonClass.changeButtonFont(new Font("Calibri Light", Font.PLAIN, 25));
        buttonClass.initializeActionListener();

        return panel;
    }
}
