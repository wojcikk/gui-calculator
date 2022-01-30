import javax.swing.*;
import java.awt.*;

    // klasa, która łączy panel wyświetlacza i klawiaturę kalkulatora

public class GUIFrontPage extends JFrame {

    GUIFrontPage() {
        this.setMinimumSize(new Dimension(300, 400));
        this.setPreferredSize(new Dimension(500, 700));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel topScreen = new GUITopScreen();
        JPanel mainContainer = new GUIButtonsPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        panel.add(topScreen, BorderLayout.NORTH);
        panel.add(mainContainer, BorderLayout.SOUTH);

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }




}
