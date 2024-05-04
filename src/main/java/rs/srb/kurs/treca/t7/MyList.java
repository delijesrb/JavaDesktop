package rs.srb.kurs.treca.t7;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.List;

public class MyList extends JFrame {
    private JList list;
    private JPanel panel1;
    private JList list2;
    private JList list1;


    public MyList() {
        this.setContentPane(panel1);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    return;
                }
                JList list = (JList) e.getSource();
                int[] is = list.getSelectedIndices();

                for (Integer i : is){
                    System.out.println(list.getModel().getElementAt(i));
                }

            }
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                {
                    if (e.getValueIsAdjusting())

                        return;
               }
               List l = (List) list1.getSelectedValuesList();
                for (int i = 0; i < l.size(); i++) {
                    System.out.println(l.get(i));

                }

            }

        });
    }

    public static void main(String[] args) {
        JFrame f = new MyList();
        f.pack();
        f.setMinimumSize(new Dimension(200, 200));
        f.setLayout(new FlowLayout());


        f.setVisible(true);
    }


}
