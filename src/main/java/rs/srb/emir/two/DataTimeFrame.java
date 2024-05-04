package rs.srb.emir.two;

import javax.swing.*;
import java.awt.*;

public class DataTimeFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DataTimeFrame::createGui);
    }
    private static void createGui(){
        JFrame frame = new JFrame("Formatiranje Datuma");

        DateTimePanel dataTimePAnel = new DateTimePanel();
        frame.setContentPane(dataTimePAnel);
       frame.pack();
        frame.setMinimumSize(new Dimension(300,300));

        frame.setVisible(true);
    }
}
