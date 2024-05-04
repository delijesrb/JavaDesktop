package rs.srb.kurs.prva.prva2;

import rs.srb.kurs.prva.prva1.MyFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLy {
    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame("card");

        Panel hp = new Panel();

        Button b1 = new Button("sdr");
        Button b2 = new Button("Dsr");

        hp.add(b1);
        hp.add(b2);

        myFrame.add(hp,BorderLayout.NORTH);

        CardLayout cardLayout = new CardLayout();
        Panel mp = new Panel();

        mp.setLayout(cardLayout);

        Panel p1 = new Panel();
        Panel P2 = new Panel();

        p1.setBackground(Color.BLACK);
        P2.setBackground(Color.CYAN);

        mp.add(p1,"p1");
        mp.add(P2,"p2");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mp,"p1");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mp,"p2");
            }
        });
        myFrame.add(mp,BorderLayout.CENTER);



        myFrame.start();
    }
}
