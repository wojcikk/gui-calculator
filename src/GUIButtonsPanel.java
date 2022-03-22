import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

    // klasa, która reprezentuje panel klawiatury,
    // posiada klasę, która inicjalizuje konkretne przyciski

public class GUIButtonsPanel {

    private final GUITopScreen guiTopScreen;

    public GUIButtonsPanel(GUITopScreen guiTopScreen) {
        this.guiTopScreen = guiTopScreen;
    }


    JPanel panel = new JPanel();
    ArrayList<JButton> buttons;
    GUIButtons buttonClass;
    public JPanel createMainContainer() {

        panel.setLayout(new GridLayout(6, 4, 10, 10));

        buttonClass = new GUIButtons(guiTopScreen);
        buttons = buttonClass.getButtons();


        for(int i = 0; i < buttons.size(); i++)
            panel.add(buttons.get(i));


        buttonClass.changeButtonShape();
        buttonClass.changeButtonColor(Color.white);
        buttonClass.changeButtonFont(new Font("Segoe", Font.PLAIN, 35 ));
        buttonClass.initializeActionListener();
        buttonClass.initializeMouseListener();

        return panel;
    }
}
