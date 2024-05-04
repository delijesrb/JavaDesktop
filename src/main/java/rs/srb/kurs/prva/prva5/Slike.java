package rs.srb.kurs.prva.prva5;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Slike extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image i = tk.getImage("C:\\Users\\delij\\Pictures\\mario.png");
        AffineTransform af = new AffineTransform();
        af.scale(0.8,0.8);
        af.rotate(0.5);
        af.translate(150,150);

        g2.setTransform(af);

        g2.drawImage(i,50,50,this);

    }


    public void start(){
        this.setSize(800,640);
        this.setVisible(true);
    }
}
