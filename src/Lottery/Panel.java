package Lottery;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {

    public static final int HEIGHT = 130;
    public static final int WIDTH = 330;


    public Panel() {
        JButton b1z10 = new Button1z10();
        JButton b3z15 = new Button3z15();
        JButton bXzY = new ButtonXzY();
        JButton bGG = new ButtonGuessGame();

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(b1z10);
        add(b3z15);
        add(bXzY);
        add(bGG);

    }
}

/*
Button1z10 - losuje 1 z puli 10 liczb
Button3z15 - losuje 3 z puli 15 liczb
ButtonXzY - losuje x z puli Y liczb
ButtonGuessGame - pozwala zgadnąć 2 liczby z puli 6
 */