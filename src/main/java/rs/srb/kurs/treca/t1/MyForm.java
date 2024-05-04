package rs.srb.kurs.treca.t1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MyForm extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyForm::createFrame);

    }
    public static void createFrame(){
        MyForm m = new MyForm();
        m.pack();
        m.setMinimumSize(new Dimension(300,300));
        m.setLocationRelativeTo(null);

        m.setLayout(new FlowLayout());
        //MyComponent mc = new MyComponent();
        //m.add(mc);
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");

        m.add(b1);
        m.add(b2);
        m.add(b3);
       // b3.setFocusable(false);

        b1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                b1.setText("fokused");
            }

            @Override
            public void focusLost(FocusEvent e) {
                b1.setText("");
            }
        });
        m.setVisible(true);

    }
}
