package rs.srb.emir.five;

import rs.srb.emir.five.data.ButtonColumn;
import rs.srb.emir.five.data.Player;
import rs.srb.emir.five.data.PlayerDao;
import rs.srb.emir.four.table.ColorCellEditor;
import rs.srb.emir.four.table.ColorCellRenderer;


import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;

public class PlayerPanel extends  JPanel {




        private  final JTable table;
        private final TableRowSorter<PlayerTableModel> tableRowSorter;
        private final JTextField filterTextField;



        public PlayerPanel() {
            setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
            PlayerTableModel playerTableModel = new PlayerTableModel();
            this.table = new JTable(playerTableModel);
            this.tableRowSorter = new TableRowSorter<>(playerTableModel);
            this.table.setRowSorter(this.tableRowSorter);
            ListSelectionModel listSelectionModel = this.table.getSelectionModel();
            this.table.setDefaultRenderer(Color.class, new ColorCellRenderer());
            this.table.setDefaultEditor(Color.class,new ColorCellEditor());




            DataChangeTableModelListener dataChangeTableModelListener = new DataChangeTableModelListener();
            this.table.getModel().addTableModelListener(dataChangeTableModelListener);
            this.table.setPreferredScrollableViewportSize(new Dimension(500,80));
            JPanel formPanel = new JPanel(new FlowLayout());
            FilterRowDocumentListener documentListener = new FilterRowDocumentListener();
            JLabel filterTextLabel = new JLabel("Filter",SwingConstants.TRAILING);
            filterTextLabel.setPreferredSize(new Dimension(100,20));
            this.filterTextField = new JTextField();
            this.filterTextField.getDocument().addDocumentListener(documentListener);
            filterTextField.setPreferredSize(new Dimension(100,20));
            filterTextLabel.setLabelFor(this.filterTextField);
            setupSportColum();
            formPanel.add(filterTextLabel);
            formPanel.add(filterTextField);

            add(new JScrollPane(table));
            add(formPanel);
            listSelectionModel.addListSelectionListener(new RollListiner() );

        }
    private void setupActionColumnModel() {
        //TableColumn actionColumn = playerTable.getColumnModel().getColumn(0);
        DeleteAction deleteAction = new DeleteAction();
        ButtonColumn buttonColumn = new ButtonColumn(table, deleteAction, 0);
        buttonColumn.setMnemonic(KeyEvent.VK_D);
    }

    private class DeleteAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            JTable table = (JTable) e.getSource();
            int modelRow = Integer.valueOf(e.getActionCommand());
            ((DefaultTableModel) table.getModel()).removeRow(modelRow);
        }
    }
        private void setupSportColum(){
            TableColumn sportColumn = table.getColumnModel().getColumn(3);
            JComboBox<String> sportComboBOx = new JComboBox<>();
            sportComboBOx.addItem("Kosarka");
            sportComboBOx.addItem("Box");
            sportComboBOx.addItem("Fudbal");
            sportComboBOx.addItem("Tenis");
            sportComboBOx.addItem("Odbojka");
            sportColumn.setCellEditor(new DefaultCellEditor(sportComboBOx));
        }

        private class FilterRowDocumentListener implements DocumentListener {

            @Override
            public void insertUpdate(DocumentEvent e) {
                filter();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filter();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filter();
            }
            private  void filter() {
                RowFilter<PlayerTableModel,Object> rowFilter = RowFilter.regexFilter(filterTextField.getText(),1);
                        tableRowSorter.setRowFilter(rowFilter);

            }
        }
        private static class DataChangeTableModelListener implements TableModelListener {

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

        private class RollListiner implements ListSelectionListener {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                int id = table.getSelectedRow();
                System.out.println("selektovani red "+id);
            }
        }
        private static class  PlayerTableModel extends AbstractTableModel {
            private final List<String> playerColumns;
            private final List<Player> players;
            PlayerDao playerDao = new PlayerDao();

            public PlayerTableModel(){
                //   private final String[] columnNames={"First Name","Last Name","Favorite Color", "Sport","Years","Vegetarian"};
                // private final String[] columnNames={"First Name","Last Name", "Sport","Years","Vegetarian"};
                //      private Object[][]tableData={
                //         {"Muhamed","Salihovic",new Color(67, 173, 31),"Kosarka",3,true},
                //         {"Mile","Vukajlovic",new Color(248, 0, 69),"Kosarka",13,false},
                //         {"Kanita","Berbic",new Color(44, 132, 145),"Odbojka" ,3,true},
                //         {"Nejra","Kadric",new Color(1, 56, 65),"Tenis",7,true},
                //         {"Alen","Botic",new Color(252, 252, 252),"Fudbal",13,false},
                //         {"Kenan ","Selimovic",new Color(126, 118, 123),"Boks" ,6,true},
                //         {"Muhamed","Salihovic",new Color(1, 56, 65),"Kosarka",3,true},
                //         {"Mile","Vukajlovic",new Color(21, 17, 234),"Kosarka",13,false},
                //         {"Kanita","Berbic",new Color(1, 56, 65),"Odbojka" ,3,true},
                //         {"Nejra","Kadric",new Color(191, 86, 31),"Tenis",7,true},
                //         {"Alen","Botic",new Color(67, 173, 31),"Fudbal",13,false},
                //         {"Kenan ","Selimovic",new Color(255, 86,187),"Boks" ,6,true}
                // };
                //
                //  private List<Player> players= new ArrayList<>();

                this.players = playerDao.selectPlayers();
                this.playerColumns = playerDao.findColumnNames();
                this.playerColumns.remove(0);
            }
            @Override
            public int getRowCount() {
                return players.size();
            }

            @Override
            public int getColumnCount() {
                return playerColumns.size();
            }



            @Override
            public String getColumnName(int columnIndex) {
                return playerColumns.get(columnIndex);
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
               Player player = players.get(rowIndex);
                return switch (columnIndex) {
                    case 0 -> player.getId();
                    case 1 -> player.getName();
                    case 2 -> player.getSurname();
                    case 3 -> player.getColor();
                    case 4 -> player.getSport();
                    case 5 -> player.getYears();
                    case 6 -> player.getVegetarian();
                    default -> "";
                };


            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return true ;
            }

            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                Player player = players.get(rowIndex);
                switch (columnIndex) {
                    case 0 -> player.setId(Long.parseLong((String) aValue));
                    case 1 -> player.setName((String) aValue);
                    case 2 -> player.setSurname((String) aValue);
                    case 3 -> player.setColor((Color) aValue);
                    case 4 -> player.setSport((String) aValue);
                    case 5 -> player.setYears((Integer) aValue);
                    case 6 -> player.setVegetarian((Boolean) aValue);
                }
                playerDao.update(player);
                fireTableCellUpdated(rowIndex,columnIndex);
            }

        }
    }


