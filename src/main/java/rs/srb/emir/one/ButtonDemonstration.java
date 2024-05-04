package rs.srb.emir.one;

import javax.swing.*;
import java.awt.*;

public class ButtonDemonstration {
    public static void main(String[] args) {

        Runnable runnable = ButtonDemonstration::createGUI;
        SwingUtilities.invokeLater(runnable);

    }

       private static void createGUI(){
        JFrame frame = new JFrame("Program sa funcionalnim dugmicima");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new ButtonPanel();
       // JPanel panel1 = new ButtonPanel();
        frame.add(panel,BorderLayout.CENTER);
     //   frame.add(panel1,BorderLayout.SOUTH);


        frame.pack();

        frame.setVisible(true);
    }
}
