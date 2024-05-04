package rs.srb.emir.three;

import rs.srb.emir.two.image.IconLoader;

import javax.swing.*;
import java.awt.*;

public class AnimalComboBoxPanel extends JPanel {
    String [] petStringArray= {
            "Bird","Cat","Pig","Rabbit","Dog"
    };

    private JComboBox animalComboBox = new JComboBox<>(petStringArray);
    private JLabel pictureLabel;
    private ComboBoxLisinter petComboBoxListener = new ComboBoxLisinter(this::updatePicture);
    public AnimalComboBoxPanel() {
        setLayout(new BorderLayout());
        animalComboBox.addActionListener(petComboBoxListener);
        pictureLabel = new JLabel();
       // pictureLabel.setPreferredSize(new Dimension(200,140));
        add(animalComboBox,BorderLayout.PAGE_START);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        add(pictureLabel,BorderLayout.PAGE_END);
        updatePicture((String) animalComboBox.getSelectedItem());
    }
    private void updatePicture(String string){
        IconLoader iconLoader = new IconLoader(AnimalComboBoxPanel.class);
        String sufix = ".gif";
        String selectedPet = (String)animalComboBox.getSelectedItem();
        String prefix = "src/main/resources/";
        String imagePatch = String.format("%s%s",selectedPet,sufix);
        Icon imageIcon = iconLoader.loadIcon(imagePatch);
        pictureLabel.setIcon(imageIcon);
    }

}
