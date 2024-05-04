package rs.srb.kurs.treca.t6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyJCBox extends JFrame {
    private JPanel myPanel;
    private JComboBox comboBox1;

    private JComboBox cb1 ;

    public MyJCBox() {
       this.setContentPane(myPanel);
     comboBox1.addItem(new city("london",3));
     comboBox1.addItem(new city("kobilje",1));
     comboBox1.setRenderer(new DefaultListCellRenderer(){
         @Override
         public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
              super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
              if (value instanceof city){
                  setText(((city)value).getName());
              }
            return this;
         }
     });

  /*comboBox1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          JComboBox comboBox = (JComboBox) e.getSource();
          city c = (city) comboBox.getSelectedItem();
          JOptionPane.showMessageDialog(null,c.getName());
      }
  });*/
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != ItemEvent.SELECTED)
                    return;

                    city c = (city) e.getItem();
                    JOptionPane.showMessageDialog(null,c.getName());
            }
        });

    }

    public static void main(String[] args) {
        JFrame f = new MyJCBox();
        f.pack();
        f.setMinimumSize(new Dimension(200,200));
        f.setLayout(new FlowLayout());



        f.setVisible(true);
    }
    class city{
        String name;
        int id;

        public city(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
/*  @Override
        public String toString() {
            return  name +
                    ", id=" + id ;
        }

       */
    }
}
