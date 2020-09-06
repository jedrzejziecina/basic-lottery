package Lottery;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.*;


import static javax.swing.JOptionPane.showMessageDialog;

class Button4 extends JButton implements ActionListener {

    private JPanel Panel = new JPanel();


    Button4(JPanel Panel) {
        super("Spróbuj szczęścia! Zgadnij 2 z 6!");
        this.Panel = Panel;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int error = -999999999;

        JTextField firstNr = new JTextField(5);
        JTextField secNr = new JTextField(5);

        JPanel myPanel = new JPanel();

        Object[] message = {
                "Pierwsza liczba:", firstNr,
                "Druga liczba:", secNr,
        };

        int aparse;
        int bparse;
        String value1;
        String value2;
        int option = JOptionPane.showConfirmDialog(null, message, "Wprowadź dwie liczby całkowite.", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {

            try {
                value1 = firstNr.getText();
                value2 = secNr.getText();
                aparse = Integer.parseInt(value1);
                bparse = Integer.parseInt(value2);

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
                    } else if (((a == x) && (b == y)) || ((b == x) && (a == y))){
                        showMessageDialog(null, "Pełen sukces! \nTwoje typowania to: " + a + " i " + b + "\nWynik losowania to: " + x + " i " + y);
                    } else if (((a == x) || (a == y)) || ((b == x) || (b == y))) {
                        showMessageDialog(null, "Częściowy sukces! \nTwoje typowania to: " + a + " i " + b + "\nWynik losowania to: " + x + " i " + y);
                    } else if (((a > 6) || (a < 1)) || ((b > 6) || (b < 1))) {
                        showMessageDialog(null, "Wpisane wartości wychodzą poza pulę losowania. \nTwoje typowania to: " + a + " i " + b + "\nProszę wpisać liczby w przedziale od 1 do 6");
                    } else {
                        showMessageDialog(null, "Chybienie! \nTwoje typowania to: " + a + " i " + b + "\nWynik losowania to: " + x + " i " + y);
                    }
                }
            } catch (Exception exe) {
                JOptionPane.showMessageDialog(null, "Wymagane jest podanie dwóch liczb!");
            }
        }else if(option == JOptionPane.CANCEL_OPTION){

        }
    }
}
