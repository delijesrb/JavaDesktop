package rs.srb.emir.three;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ComboBoxDemo::createAndShowGui);
    }
    private static void createAndShowGui(){
        JFrame frame = new JFrame("Combo Demonstration");


        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // JPanel panel = new ComboBoxPanel();
        //    JPanel animal = new AnimalComboBoxPanel();

       JPanel panel = new CustomComboBox();
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);

    }

}
