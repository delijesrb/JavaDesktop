package rs.srb.emir.four.table;

import rs.srb.emir.four.TableDemo;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleTablePanel extends JPanel {
    private final Object[] columnNames={"First Name","Last Name", "Sport","Years","Vegetarian"};
   // private final String[] columnNames={"First Name","Last Name", "Sport","Years","Vegetarian"};
    private Object[][]tableData={
            {"Muhamed","Salihovic","Kosarka",3,true},
            {"Mile","Vukajlovic","Kosarka",13,false},
            {"Kanita","Berbic","Odbojka" ,3,true},
            {"Nejra","Kadric","Tenis",7,true},
            {"Alen","Botic","Fudbal",13,false},
            {"Kenan ","Selimovic","boks" ,6,true},
           {"Muhamed","Salihovic","Kosarka",3,true},
           {"Mile","Vukajlovic","Kosarka",13,false},
           {"Kanita","Berbic","Odbojka" ,3,true},
           {"Nejra","Kadric","Tenis",7,true},
           {"Alen","Botic","Fudbal",13,false},
           {"Kenan ","Selimovic","boks" ,6,true}
    };
    private final  JTable table = new JTable( tableData,columnNames);
    public SimpleTablePanel(){

      table.setPreferredScrollableViewportSize(new Dimension(500,80));
      //table.setFillsViewportHeight(true);
       TableMausAdapter tableMausAdapter = new TableMausAdapter();
       table.addMouseListener(tableMausAdapter);
      JScrollPane scrollPane = new JScrollPane(table);
      add(scrollPane);
    }
    private class TableMausAdapter extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int rowNumber = table.getRowCount();
            int columnNumber = table.getColumnCount();
            TableModel tableModel = table.getModel();
            for (int i = 0; i < rowNumber; i++) {
                for (int j = 0; j < columnNumber; j++) {
                    System.out.print(" "+tableModel.getValueAt(i,j));

                }
                System.out.println();
            }

        }
    }
}
