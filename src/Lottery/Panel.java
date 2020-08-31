package Lottery;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {

    public static final int HEIGHT = 130;
    public static final int WIDTH = 330;


    private JButton bButton;
    private JButton bButton2;
    private JButton bButton3;
    private JButton bButton4;


    public Panel() {
        bButton = new Button(this);
        bButton2 = new Button2(this);
        bButton3 = new Button3(this);
        bButton4 = new Button4(this);

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(bButton);
        add(bButton2);
        add(bButton3);
        add(bButton4);

    }
}