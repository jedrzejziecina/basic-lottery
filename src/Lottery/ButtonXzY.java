package Lottery;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


class ButtonXzY extends JButton implements ActionListener {

    ButtonXzY() {
        super("Przygotuj swoje losowanie");
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        JTextField nrPoll = new JTextField(5);
        JTextField nrNumber = new JTextField(5);

        Object[] message = {
                "Podaj liczbę reprezentującą pulę, z której odbędzie się losowanie \n np. 60", nrPoll,
                "Podaj ilość liczb, która zostać wylosowana \n np 3", nrNumber,
        };

        int a;
        int b;
        String s;
        String s2;
        int option = JOptionPane.showConfirmDialog(null, message, "Utwórz własne losowanie.", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try{
                s = nrPoll.getText();
                s2 = nrNumber.getText();
                a = Integer.parseInt(s);
                b = Integer.parseInt(s2);

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
            }catch(Exception exe)
            {
                JOptionPane.showMessageDialog(null, "Wymagane jest uzupełnienie wszystkich pól!");
            }

        }else if(option == JOptionPane.CANCEL_OPTION){
            //
        }
    }
}
