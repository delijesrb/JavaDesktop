package rs.srb.kurs.prva.prva1;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    public MyFrame(String title) {
       this.setTitle(title);
      // this.add(new Label("Nekki Text"));
       this.addWindowListener(new WindowAdapter(){
            @Override
            public  void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
      /*  Label l = new Label("Click me");
        l.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                l.setText("Mouse clicked");
            }
        });
        this.add(l);*/
    }
    public void start(){

        this.setSize(640,480);
        this.setVisible(true);
    }
}
