package rs.srb.zadatak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadatak extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Zadatak::startGUI);
    }
    public static void startGUI(){

        Zadatak zadatak = new Zadatak();
        zadatak.setSize(640,480);
        zadatak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        zadatak.setLocationRelativeTo(null);
        zadatak.setLayout(new FlowLayout());
        ColorPanel colorPanel = new ColorPanel();

        zadatak.add(colorPanel);
        zadatak.pack();
        int choose = JOptionPane.showOptionDialog(null,"Choose option","Zadatak",JOptionPane.YES_NO_OPTION,
                                            JOptionPane.QUESTION_MESSAGE,null,new String[]{"Setting","Close"},null);
       if (choose ==0){
           zadatak.setVisible(true);

       }else {
           zadatak.setVisible(false);
       }




    }

}