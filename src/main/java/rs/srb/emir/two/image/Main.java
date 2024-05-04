package rs.srb.emir.two.image;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class Main extends JFrame {
        static Timer t;
        static int countdown = 10;
        //...
        public static void main(String[] args) {
            Main f = new Main();
            //...
            f.setVisible(true);
            f.setTitle("Countdown");

            JLabel lbl = new JLabel("10");
            f.add(lbl);

            JButton btn = new JButton("Start");
            f.add(btn);
            btn.addActionListener(eb -> {
                t = new Timer(1000, et -> {
                    countdown--;
                    lbl.setText(countdown + "");
                    if(countdown == 0) {
                        t.stop();
                    }
                });
                t.start();
            });
        }
    }

