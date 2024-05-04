package rs.srb.kurs.prva.prva3;

import rs.srb.kurs.prva.prva1.MyFrame;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class Coise {
    public static void main(String[] args) {

        MyFrame f = new MyFrame("s");
        f.setLayout(new BorderLayout());
        f.start();

         Choice c = new Choice();
         c.setBounds(350,150,100,50);
     /*     c.add("audi");
        c.add("bmw");
        c.add("toyota");

*/
        List<car> cars = new ArrayList<>();
      cars.add(new car(17,"mercedes"));
        cars.add(new car(1,"bmw"));
        cars.add(new car(15,"zastava"));

        for (car car1 : cars
             ) {
            c.add(car1.name);

        }
        f.add(c);
        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Choice c = (Choice) e.getSource();
                car sc = cars.get(c.getSelectedIndex());

                System.out.println(sc.id);
            }
        });



    }
}
class car {
    int id;
    String name;

    public car(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
