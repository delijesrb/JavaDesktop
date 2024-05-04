package rs.srb.kurs.prva.prva3;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Frame frame = new Frame();
        frame.setSize(640,480);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

     /*   Label label = new Label("Klikni");
        frame.add(label);

        Button b = new Button("B");
        b.setPreferredSize(new Dimension(100,100));

        frame.add(b);
       b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                b.setLabel("Text");
                b.setBackground(Color.BLACK);

            }
        });*/

       Checkbox cb = new Checkbox("CB1");
       frame.add(cb);
       cb.setPreferredSize(new Dimension(200,200));

       cb.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               if(cb.getState()){
                   cb.setLabel("cheked");
               }else {
                   cb.setLabel("uncheked");
               }
           }
       });


    }
}
