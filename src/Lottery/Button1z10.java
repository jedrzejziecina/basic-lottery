package Lottery;

import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

class Button1z10 extends JButton implements ActionListener {

    Button1z10() {
        super("Rozpocznij losowanie 1 z 10");
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Random nr = new Random();
        int rd = nr.nextInt(10) + 1;
        showMessageDialog(null, "Losowano jedną liczbę z przedziału od 1 do 10. \nWylosowana liczba to: \n" + "[" + rd + "]");
    }

}
