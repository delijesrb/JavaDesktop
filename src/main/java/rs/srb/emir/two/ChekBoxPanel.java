package rs.srb.emir.two;

import rs.srb.emir.two.ChangeModel;
import rs.srb.emir.two.GeekPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.util.function.Consumer;

public class ChekBoxPanel extends JPanel {
    private final JCheckBox chinCheckBox;
    private final JCheckBox glassesCheckBox;
    private final JCheckBox hairCheckBox;
    private final JCheckBox teethCheckBox;
    private CheckBoxLisinter checkBoxLisinter =new CheckBoxLisinter();
    private final Consumer<ChangeModel> changeModelConsumer;


    public ChekBoxPanel(Consumer<ChangeModel> changeModelConsumer){

        setLayout(new BorderLayout());
        this.changeModelConsumer = changeModelConsumer;

        setLayout(new GridLayout(0, 1));
        chinCheckBox = createChekBox("Chin",true,KeyEvent.VK_C);
        glassesCheckBox =createChekBox("Glasses",true, KeyEvent.VK_G);
        hairCheckBox = createChekBox("Hair",true,KeyEvent.VK_H);
        teethCheckBox = createChekBox("Teeth",true,KeyEvent.VK_T);


        add(chinCheckBox);
        add(glassesCheckBox);
        add(hairCheckBox);
        add(teethCheckBox);

    }
    private  JCheckBox createChekBox(String text, boolean selected,int mnemonic){
        JCheckBox checkBox = new JCheckBox(text,selected);
        checkBox.addItemListener(checkBoxLisinter);
        checkBox.setMnemonic(mnemonic);
        return checkBox;
    }



    private class  CheckBoxLisinter implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            JCheckBox checkbox =  (JCheckBox) e.getItemSelectable();
            char slovo = '-';
            int index = 0;
            if (checkbox == chinCheckBox){
                index=0;
                slovo = 'c';
            }else if (checkbox == glassesCheckBox){
                index = 1;
                slovo = 'g';
            } else if (checkbox == hairCheckBox) {
                index = 2;
                slovo = 'h';

            } else if (checkbox == teethCheckBox) {
                index = 3;
                slovo = 't';

            }
            if (e.getStateChange()==ItemEvent.DESELECTED){
                slovo = '-';
            }
            changeModelConsumer.accept(new ChangeModel(index, slovo));
          // imageName.setCharAt(index,slovo);
            //updateImageLabel();
        }
    }
}
