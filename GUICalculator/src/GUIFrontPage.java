import javax.swing.*;
import java.awt.*;

    // klasa, która łączy panel wyświetlacza i klawiaturę kalkulatora

public class GUIFrontPage extends JFrame {

    GUITopScreen guiTopScreen = new GUITopScreen();
    GUIButtonsPanel guiButtonsPanel = new GUIButtonsPanel(guiTopScreen);

    GUIFrontPage() {
        this.setMinimumSize(new Dimension(300, 400));
        this.setPreferredSize(new Dimension(500, 700));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel topScreen;
        topScreen = guiTopScreen.createTopScreen();
        JPanel mainContainer;
        mainContainer = guiButtonsPanel.createMainContainer();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        panel.add(topScreen, BorderLayout.NORTH);
        panel.add(mainContainer, BorderLayout.SOUTH);

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }




}
