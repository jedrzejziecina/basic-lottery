package Lottery;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

class Button2 extends JButton implements ActionListener {

    private JPanel Panel;

    Button2(JPanel Panel) {
        super("Rozpocznij losowanie 3 z 15");
        this.Panel = Panel;
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Random rd  = new Random();
        List<Integer> nrlist = new ArrayList<>();
        int nr;

        for(int i=1; i<=3;i++){
            nr = rd.nextInt(15)+1;
            while(nrlist.contains(nr)) {
                nr = rd.nextInt(15)+1;
            }
            nrlist.add(nr);
        }
        Collections.sort(nrlist);
        showMessageDialog(null, "Losowano trzy liczby z przedziału od 1 do 15. \nWylosowane liczby to: \n" + nrlist);
    }

}