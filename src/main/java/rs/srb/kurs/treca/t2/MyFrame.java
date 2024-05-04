package rs.srb.kurs.treca.t2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{

    private JPanel mainPanel;
    private JLabel myLabel;
    private JButton myButton;
    private JButton button1;
    //   private JLabel testLabel1;

    ActionListener my =new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, e.getActionCommand());

        }


    };

    public MyFrame(){
        this.setContentPane(new JPanel());
      //  testLabel1 = new JLabel("new text label");
        this.myButton.setMnemonic(KeyEvent.VK_B);
        myButton.setActionCommand("to je taj rad");
        button1.setActionCommand("ma cao");
      myButton.addActionListener(my);
      button1.addActionListener(my);

    //    testLabel1 = new JLabel("<html>Hallo<br/>from<br/>my<br/>label<html>");
      //  this.add(testLabel1);
        this.add(myLabel);
        this.add(myButton);
        this.add(button1);


        myLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabel label = (JLabel) e.getComponent();
                label.setText("prazno");
            }
        });

    }

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());



        frame.setVisible(true);

    }

}
