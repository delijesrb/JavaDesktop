package rs.srb.kurs.prva.prva2;

import java.awt.*;

public class BorderL {
    public static void main(String[] args) {
        Frame f = new Frame();

        Button b = new Button("t");
        f.add(b, BorderLayout.PAGE_START);

        Button b1 = new Button("s");
        f.add(b1,BorderLayout.CENTER);

        f.setSize(640,480);
        f.setVisible(true);
    }
}
