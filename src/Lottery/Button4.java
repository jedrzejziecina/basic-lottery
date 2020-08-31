package Lottery;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

class Button4 extends JButton implements ActionListener {

    private JPanel Panel;

    Button4(JPanel Panel) {
        super("Spróbuj szczęścia! Zgadnij 2 z 6!");
        this.Panel = Panel;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int error = -999999999;
        int aparse = error;
        int bparse = error;

        try {
            String s = JOptionPane.showInputDialog("Podaj pierwszą dodatnią liczbę od 1 do 6");
            aparse = Integer.parseInt(s);
            try {
                String s2 = JOptionPane.showInputDialog("Podaj drugą dodatnią liczbę od 1 do 6");
                bparse = Integer.parseInt(s2);
            } catch (Exception exe2) {
                JOptionPane.showMessageDialog(null, "Nie podano drugiej liczby");
            }
        } catch (Exception exe) {
            JOptionPane.showMessageDialog(null, "Nie podano pierwszej liczby");
        }


        int a = aparse;
        int b = bparse;
        Random rd = new Random();
        List<Integer> nrlist = new ArrayList<>();
        int nr;

        for (int i = 1; i <= 2; i++) {
            nr = rd.nextInt(6) + 1;
            while (nrlist.contains(nr)) {
                nr = rd.nextInt(6) + 1;
            }
            nrlist.add(nr);
        }
        Collections.sort(nrlist);
        int x = nrlist.get(0);
        int y = nrlist.get(1);

        if ((a == error) || (b == error)) {

        } else {
            if (a == b) {
                showMessageDialog(null, "Podane liczby nie mogą być takie same. \nSpróbuj ponownie!");
            } else if (((a > 6) || (a < 1)) || ((b > 6) || (b < 1))) {
                showMessageDialog(null, "Wpisane wartości wychodzą poza pulę losowania. \nTwoje typowania to: " + a + " i " + b + "\nProszę wpisać liczby w przedziale od 1 do 6");
            } else if (((a == x) || (a == y)) || ((b == x) || (b == y))) {
                showMessageDialog(null, "Częściowy sukces! \nTwoje typowania to: " + a + " i " + b + "\nWynik losowania to: " + x + " i " + y);
            } else if (((a == x) && (b == y)) || ((b == x) && (a == y))) {
                showMessageDialog(null, "Pełen sukces! \nTwoje typowania to: " + a + " i " + b + "\nWynik losowania to: " + x + " i " + y);
            } else {
                showMessageDialog(null, "Chybienie! \nTwoje typowania to: " + a + " i " + b + "\nWynik losowania to: " + x + " i " + y);
            }
        }
    }
}
