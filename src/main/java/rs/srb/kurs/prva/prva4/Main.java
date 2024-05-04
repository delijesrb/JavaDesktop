package rs.srb.kurs.prva.prva4;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Main extends Frame {

    static int endcap;
    @Override
    public void paint(Graphics g) {
         Graphics2D g2 = (Graphics2D) g;

       /* g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.RED);
         g2.drawLine(50,50,150,250);
         g2.setColor(Color.BLUE);
         g2.setStroke(new BasicStroke(1));
         g2.drawLine(80,80,200,350);
*/
        //g2.drawOval(300,200,100,100);

      //  g2.drawArc(100,100,100,80,0,90);
       /* g2.setColor(Color.YELLOW);
        g2.fillOval(50,50,100,100);
        g2.setColor(Color.RED);
        g2.drawOval(50,50,100,100);

        g2.setColor(Color.YELLOW);
        Polygon p = new Polygon(new int[ ] {150,200,150,100},new int[]{50,100,150,100},4 );
        g2.drawPolygon(p);


        */


      //  g.drawArc(100,100,100,100,0,endcap);

     /*   g2.setColor(Color.RED);
        g2.fillRect(50,50,150,250);

        g2.translate(150,150);


        g2.setColor(Color.blue);
        g2.fillRect(50,50,150,250);

        g2.rotate(Math.PI/2,150,150);

        g2.setColor(Color.YELLOW);
        g2.drawRect(50,50,150,250);


      */
        g2.setColor(Color.RED);
        g2.drawRect(50,50,100,110);

        AffineTransform at = new AffineTransform();
        at.translate(200,200);

        at.scale(0.5,0.5);
        g2.setTransform(at);

        g2.setColor(Color.BLUE);
        g2.drawRect(50,50,100,110);

    }

    public static void main(String[] args) throws InterruptedException {
        Main f = new Main();
        f.setSize(640,480);
        f.setVisible(true);


        Label l1 = new Label("Enter first number");
        Label l2 = new Label("Choose operation");
        Label l3 = new Label("Enter second number");
        Label l4 = new Label("Result is");
        l1.setBounds(100,100,100,20);
        l2.setBounds(100,150,100,20);
        l3.setBounds(100,200,100,20);
        l4.setBounds(100,300,100,20);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);

      /*  for (int i = 0; i <= 360; i++) {
            endcap = endcap+i;
            f.repaint();

            Thread.sleep(60);
        }

       */




    }
}
