package rs.srb.kurs.treca.t1;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class MyComponent extends JComponent {
    public MyComponent() {
        setPreferredSize(new Dimension(200,50));
            setToolTipText("This is tool tip");
        //setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
        //setBorder(BorderFactory.createBevelBorder(1));
        //setBorder(BorderFactory.createEtchedBorder(0));
        //setBorder(BorderFactory.createMatteBorder(5,3,5,3,Color.YELLOW));
        setBorder(BorderFactory.createTitledBorder("title"));



    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 165, 50);
        g.setColor(Color.darkGray);
        g.drawString("Hello from my component", 10, 40);
    }
}