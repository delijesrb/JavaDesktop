package rs.srb.kurs.treca.t4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame {
    private JPanel my;
    private JCheckBox cb;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;

    public MyForm()  {
        this.setContentPane(my);

       /* cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox checkBox = (JCheckBox) e.getSource();
                checkBox.setText(e.getStateChange()== ItemEvent.SELECTED ? "You Agree": "You don't Agree");
            }
        });

        */
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton jRadioButton = (JRadioButton)e.getSource();
                e.getActionCommand();
                JOptionPane.showMessageDialog(null,jRadioButton.getText());
            }
        };
        rb1.addActionListener(listener);
        rb2.addActionListener(listener);
        rb3.addActionListener(listener);
    }

    public static void main(String[] args) {
        JFrame f = new MyForm();
        f.pack();
        f.setMinimumSize(new Dimension(200,200));
        f.setLayout(new FlowLayout());
       /*     JToggleButton tb = new JToggleButton("hello click me");
        f.add(tb);

    tb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JToggleButton tb = (JToggleButton) e.getSource();
                tb.setText((e.getStateChange()== ItemEvent.SELECTED) ? "on" : "off");
            }
        });

      */


        f.setVisible(true);
    }
}
