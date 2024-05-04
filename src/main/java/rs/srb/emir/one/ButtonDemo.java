package rs.srb.emir.one;

import javax.swing.*;
import java.awt.*;

public class ButtonDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Demonstration ");
       // frame.setSize(640,480);
        Dimension dimension = new Dimension();
        dimension.setSize(640,480);
        frame.setMinimumSize(dimension);
         JButton top = new JButton("top");
         JButton pageStart = new JButton("Line Start");
         JButton centar = new JButton("Center");
         JButton pageEnd = new JButton("Line end");
         JButton button = new JButton("Boton");

         frame.add(top,BorderLayout.NORTH);
         frame.add(pageStart,BorderLayout.WEST);
         frame.add(centar,BorderLayout.CENTER);
         frame.add(pageEnd,BorderLayout.LINE_END);
         frame.add(button,BorderLayout.PAGE_END);

        frame.setVisible(true);



    }

}
