package rs.srb.emir.five;

import rs.srb.emir.four.table.TablePanel;

import javax.swing.*;

public class Tabela extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Tabela::startGUI);

    }
    public static void startGUI(){
        JFrame frame = new JFrame("TABELA" );
        //  SimpleTablePanel simpleTablePanel = new SimpleTablePanel();
        // frame.add(simpleTablePanel);
       PlayerPanel panel = new PlayerPanel();
        frame.add(panel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.pack();
        frame.setVisible(true);


    }
}
