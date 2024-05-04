package rs.srb.emir.four.table;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class ColorCellEditor extends AbstractCellEditor implements TableCellEditor{
    public static final String EDIT = "Edit";
    private Color currentColor;
    private JButton button;
    private JColorChooser colorChooser;
    private JDialog dialog;

    public ColorCellEditor() {
        this.button = new JButton();
        this.button.setActionCommand(EDIT);
        this.button.addActionListener(this::onButtonClick);

        this.colorChooser = new JColorChooser();
        this.dialog = JColorChooser.createDialog(button,"Pick color", true, colorChooser, this::onColorChoose, null);

    }


    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        currentColor = (Color) value;


        return button;
    }


    public void onColorChoose(ActionEvent e) {

            currentColor = colorChooser.getColor();

    }
    public void onButtonClick(ActionEvent event){
        if (EDIT.equals(event.getActionCommand())) {
            button.setBackground(currentColor);
            colorChooser.setColor(currentColor);
            dialog.setVisible(true);
            fireEditingStopped();

        }
    }

    @Override
    public Object getCellEditorValue() {
        return currentColor;
    }

    @Override
    public boolean isCellEditable(EventObject anEvent) {
        return true;
    }
}


