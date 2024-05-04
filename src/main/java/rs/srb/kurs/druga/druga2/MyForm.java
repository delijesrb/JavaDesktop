package rs.srb.kurs.druga.druga2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame {
    private JPanel mainPanel;
    private JButton Cancel;
    private JTextField lastName;
    private JTextField firstName;
    private JButton Ok;
    private JLabel lastaName;
    private JLabel fnl;



    public MyForm()  {
        this.setContentPane(mainPanel);
        Ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String fn = firstName.getText();
              String ln = lastName.getText();

              if (fn.length() == 0 & ln.length()==0){
                  return;
              }
              JOptionPane.showMessageDialog(mainPanel,"Hallo "+ fn+" "+ln);
            }
        });

        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstName.setText("");
                lastName.setText("");
                
            }
        });

    }

    public static void main(String[] args) {
        MyForm f = new MyForm();

        f.setSize(900,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);


        f.setVisible(true);


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
