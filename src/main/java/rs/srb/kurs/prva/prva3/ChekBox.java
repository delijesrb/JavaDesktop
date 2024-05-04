package rs.srb.kurs.prva.prva3;

import rs.srb.kurs.prva.prva1.MyFrame;

import java.awt.*;

public class ChekBox {
    public static void main(String[] args) {

        MyFrame f = new MyFrame("sd");
       f.setLayout(new FlowLayout());
        f.start();


        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("C1",true,cbg);
        f.add(c1);
        Checkbox c2 = new Checkbox("B",false,cbg);
        f.add(c2);
        Checkbox c3 = new Checkbox("A",false,cbg);
        f.add(c3);

       /*Checkbox c = new Checkbox("CB");
         f.add(c);
        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (c.getState()){
                    c.setLabel("Checked");
                }else {
                    c.setLabel("Unchecked");
                }
            }
        });*/
    }
}
