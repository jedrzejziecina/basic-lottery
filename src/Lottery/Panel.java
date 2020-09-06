package Lottery;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {

    public static final int HEIGHT = 130;
    public static final int WIDTH = 330;


    public Panel() {
        JButton bButton = new Button();
        JButton bButton2 = new Button2();
        JButton bButton3 = new Button3();
        JButton bButton4 = new Button4();

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(bButton);
        add(bButton2);
        add(bButton3);
        add(bButton4);

    }
}