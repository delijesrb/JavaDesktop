package rs.srb.emir.four;

import rs.srb.emir.four.table.SimpleTablePanel;
import rs.srb.emir.four.table.TablePanel;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableDemo {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(TableDemo::createGUI);


    }
    private static void createGUI(){
        JFrame frame = new JFrame("TABELA" );
     //  SimpleTablePanel simpleTablePanel = new SimpleTablePanel();
       // frame.add(simpleTablePanel);
        TablePanel tablePanel = new TablePanel();
        frame.add(new TablePanel());


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.pack();
        frame.setVisible(true);

    }

    private class TableMausAdapter extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {

        }

    }

}
