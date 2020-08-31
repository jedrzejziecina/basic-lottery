package Lottery;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


class Button3 extends JButton implements ActionListener {

    private JPanel Panel;

    Button3(JPanel Panel) {
        super("Przygotuj swoje losowanie");
        this.Panel = Panel;
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String s = JOptionPane.showInputDialog("Podaj liczbę reprezentującą pulę, z której odbędzie się losowanie \n np. 60");
        int a = Integer.parseInt(s);
        String s2 = JOptionPane.showInputDialog("Podaj ilość liczb, która zostać wylosowana \n np 3");
        int b = Integer.parseInt(s2);

        if(b<a) {
            Random rd = new Random();
            List<Integer> nrlist = new ArrayList<>();
            int nr;

            for (int i = 1; i <= b; i++) {
                nr = rd.nextInt(a) + 1;
                while (nrlist.contains(nr)) {
                    nr = rd.nextInt(a) + 1;
                }
                nrlist.add(nr);
            }
            Collections.sort(nrlist);
            showMessageDialog(null, "Wybrana pula liczb: " + a + " \nIlość liczb do wylosowania: " + b + " \nWynik losowania: " + nrlist);
        }
        else {
            showMessageDialog(null, "Wpisane dane są niepoprawne. \nIlość szukanych liczb nie może być większa od wybranej puli \nProszę spróbować ponownie.");
        }
    }

}
