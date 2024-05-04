package rs.srb.kurs.cetri.tri;

import rs.srb.kurs.cetri.jedan.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Brojac extends JFrame{
    private JPanel my;
    static Integer elapsed = 0;

    public Brojac() {
        this.setContentPane(my);
    }

    public static void main(String[] args) {
        Brojac f = new Brojac();
        f.setSize(640,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        f.setVisible(true);
        JButton b = new JButton();
        JButton b1 = new JButton();
        f.add(b);
        f.add(b1);
        JColorChooser jcc = new JColorChooser();
        JDialog dialog = JColorChooser.createDialog(null, "Choose color", true, jcc, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ok pressed");
            }
        }, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cancel pressed");
            }
        });
        dialog.setVisible(true);






     /*   Timer = new Timer(1000, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 f.setTitle("Time elapsed: " + (elapsed++).toString());


             }
         });
         timer.start();

      */
        Action a = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "action performed");
            }
        };
        b1.setAction(a);
        b.setAction(a);
    }
}
