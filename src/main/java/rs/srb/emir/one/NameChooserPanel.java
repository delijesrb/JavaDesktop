package rs.srb.emir.one;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NameChooserPanel extends JPanel {
    static String [] names = {"Alen","MAki","Nesa","Dale","Ivica","Rale"};

    private JLabel chosenName = new JLabel("The chosen Name");
    private JLabel selectedName;

    private final JButton pickNameButton;

    public NameChooserPanel(){
        this.pickNameButton = new JButton("pick name");
        this.selectedName = new JLabel(names[0]);
    }
    private void onPickNameButton(ActionEvent actionEvent){

    }

}
