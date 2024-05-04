package rs.srb.kurs.prva.prva5;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;

public class FFrame extends Frame {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

      //  g2.drawString("halo srki",50,50);

     /*   FontRenderContext frc = g2.getFontRenderContext();
        Font font = new Font("Ariel",Font.PLAIN,36);

        TextLayout tl= new TextLayout("SRecko tototot",font,frc);

        tl.draw(g2,100,100);

*/
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        FontRenderContext frc = g2.getFontRenderContext();
        Font font = new Font("Ariel",Font.PLAIN,65);

        TextLayout tl= new TextLayout("SRecko tototot",font,frc);

        tl.draw(g2,100,100);





    }
    public void start(){
        this.setSize(800,640);
        this.setVisible(true);
    }
}
