package rs.srb.kurs.prva.prva3;

import rs.srb.kurs.prva.prva1.MyFrame;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LIstaList {
    public static void main(String[] args) {

        MyFrame f = new MyFrame("T");
        f.setLayout(new FlowLayout());
        f.start();

        List l = new List(2,true);





        l.add("ford");
        l.add("golf");
        l.add("peugeot");

        f.add(l);

        l.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                List list = (List) e.getSource();
                String[] arrey = list.getSelectedItems();
                for (int i = 0; i < arrey.length; i++) {
                    System.out.println(arrey[i]+"__________");

                }
            }
        });

    }
}
