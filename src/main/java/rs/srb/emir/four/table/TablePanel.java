package rs.srb.emir.four.table;

import rs.srb.emir.four.TableDemo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.*;

public class TablePanel extends JPanel {
    private  final JTable table;

    public TablePanel() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        CustomTableModel customTableModel = new CustomTableModel();
        this.table = new JTable(customTableModel);
        ListSelectionModel listSelectionModel = this.table.getSelectionModel();
        this.table.setDefaultRenderer(Color.class, new ColorCellRenderer());
        this.table.setDefaultEditor(Color.class,new ColorCellEditor());

        DataChangeTableModelListener dataChangeTableModelListener = new DataChangeTableModelListener();
        this.table.getModel().addTableModelListener(dataChangeTableModelListener);
        this.table.setPreferredScrollableViewportSize(new Dimension(500,80));
        add(new JScrollPane(table));
        listSelectionModel.addListSelectionListener(new RollListiner() );

    }
    private class DataChangeTableModelListener implements TableModelListener {

        @Override
        public void tableChanged(TableModelEvent tableModelEvent) {
            int rowIndex = tableModelEvent.getFirstRow();
            int columnIndex = tableModelEvent.getColumn();
            TableModel tableModel = (TableModel) tableModelEvent.getSource();
            String columnName = tableModel.getColumnName(columnIndex);
            Object data = tableModel.getValueAt(rowIndex,columnIndex);

            System.out.println("Deslila se promena u koloni sa imenom: " + columnName);
            System.out.println("novi podatak: " + data);

        }}

    private class RollListiner implements ListSelectionListener{

        @Override
        public void valueChanged(ListSelectionEvent e) {
            int id = table.getSelectedRow();
            System.out.println("selektovani red "+id);
        }
    }
    private class CustomTableModel extends AbstractTableModel {
        private final String[] columnNames={"First Name","Last Name","Favorite Color", "Sport","Years","Vegetarian"};
        // private final String[] columnNames={"First Name","Last Name", "Sport","Years","Vegetarian"};
        private Object[][]tableData={
                {"Muhamed","Salihovic",new Color(67, 173, 31),"Kosarka",3,true},
                {"Mile","Vukajlovic",new Color(248, 0, 0, 69),"Kosarka",13,false},
                {"Kanita","Berbic",new Color(44, 132, 145),"Odbojka" ,3,true},
                {"Nejra","Kadric",new Color(1, 56, 65),"Tenis",7,true},
                {"Alen","Botic",new Color(252, 252, 252),"Fudbal",13,false},
                {"Kenan ","Selimovic",new Color(126, 118, 123),"Boks" ,6,true},
                {"Muhamed","Salihovic",new Color(1, 56, 65),"Kosarka",3,true},
                {"Mile","Vukajlovic",new Color(21, 17, 234),"Kosarka",13,false},
                {"Kanita","Berbic",new Color(1, 56, 65),"Odbojka" ,3,true},
                {"Nejra","Kadric",new Color(191, 86, 31),"Tenis",7,true},
                {"Alen","Botic",new Color(67, 173, 31),"Fudbal",13,false},
                {"Kenan ","Selimovic",new Color(255, 86, 187),"Boks" ,6,true}
        };

        @Override
        public int getRowCount() {
            return tableData.length;
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }



        @Override
        public String getColumnName(int columnIndex) {
            return columnNames[columnIndex];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            Object cellValue = getValueAt(0,columnIndex);
           // return cellValue != null ? cellValue.getClass(): String.class;
            if (cellValue != null) return cellValue.getClass();
            return String.class;
            //return getValueAt(0,columnIndex).getClass();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return tableData[rowIndex][columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            if (columnIndex<2){
                return false;
            }else {
                return true;
            }
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            tableData [rowIndex][columnIndex]=aValue;
            fireTableCellUpdated(rowIndex,columnIndex);
        }

    }
}
