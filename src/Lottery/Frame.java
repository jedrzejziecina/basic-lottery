package Lottery;

import java.awt.Toolkit;
import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {
        super("Symulator Maszyny Losującej");

        JPanel Panel = new Panel();
        add(Panel);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;

        this.setSize(width/5, height/2);
        int frameWidth = this.getSize().width;
        int frameHeight = this.getSize().height;
        this.setLocation((width-frameWidth)/2, (height-frameHeight)/2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}