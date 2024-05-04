package rs.srb.emir.three;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

public class ComboBoxLisinter implements ActionListener {
    private Consumer<String> consumer;

    public ComboBoxLisinter(Consumer<String> consumer) {
      this.consumer = consumer;
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        JComboBox<String> comboBox = (JComboBox<String>)e.getSource();
        String value = (String) comboBox.getSelectedItem();
        consumer.accept(value);

    }
}
