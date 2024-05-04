package rs.srb.emir.four.table;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class ColorCellRenderer extends JLabel implements TableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Color colorValue = (Color) value;
        JLabel label = new JLabel();
        label.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));

        label.setBackground(colorValue);
        label.setOpaque(true);
        return label;
    }
}
