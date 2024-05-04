package rs.srb.emir.two;

import javax.swing.*;
import javax.swing.plaf.SeparatorUI;

public class GeekFrame {
    public static void main(String[] args) {
  SwingUtilities.invokeLater(GeekFrame::createAdnShowGUI);
    }
    private static void createAdnShowGUI(){
        JFrame prozor = new JFrame("Streber");

       JPanel geekPanel = new GeekPanel();
     //  geekPanel.setOpaque(true);
       prozor.setContentPane(geekPanel);


       prozor.pack();
        prozor.setSize(800,640);
        prozor.setLocationRelativeTo(null);

        prozor.setVisible(true);



    }
}
