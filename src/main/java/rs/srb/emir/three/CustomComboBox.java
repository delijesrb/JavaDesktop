package rs.srb.emir.three;

import rs.srb.emir.two.image.IconLoader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CustomComboBox extends JPanel {
    private JComboBox<PetModel> petModelJComboBox;
    private String [] petStringArray= {
            "Bird","Cat","Pig","Rabbit","Dog"
    };
    private IconLoader iconLoader = new IconLoader(CustomComboBox.class);


    public CustomComboBox (){
        setLayout(new BorderLayout());
        PetModel[] petModels = loadItems();
        petModelJComboBox = new JComboBox<>(petModels);
        ComboBoxRendere comboBoxRendere = new ComboBoxRendere();
        petModelJComboBox.setRenderer(comboBoxRendere);
        add(petModelJComboBox,BorderLayout.PAGE_START);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }
    private PetModel[] loadItems(){
        List<PetModel> petModels = new ArrayList<>();
        for (String petName : petStringArray){

            String sufix = ".gif";
            String imagePatch = String.format("%s%s",petName,sufix);
            PetModel petModel = new PetModel();
            petModel.setPetName(petName);
            petModel.setImageIcon(iconLoader.loadIcon(imagePatch));
            petModels.add(petModel);
        }return petModels.toArray(new PetModel[0]);
    }
    private class  ComboBoxRendere  implements ListCellRenderer<PetModel>{

        @Override
        public Component getListCellRendererComponent(JList<? extends PetModel> list, PetModel petModel, int index, boolean isSelected, boolean cellHasFocus) {
           JLabel label = new JLabel();
           label.setIcon(petModel.getImageIcon());
           label.setText(petModel.getPetName());
           return label;
        }
    }
}
