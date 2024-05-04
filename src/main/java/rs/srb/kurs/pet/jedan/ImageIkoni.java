package rs.srb.kurs.pet.jedan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.awt.Label.LEFT;

public class ImageIkoni  extends JFrame{
    private JPanel my;

    public ImageIkoni() {
        this.setContentPane(my);
    }

    public static void main(String[] args) {

    }private void stratGUI(){
        JFrame f = new ImageIkoni();
        f.setSize(640,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

        ImageIcon ii = new ImageIcon("C:\\java_programs\\Java_Desktop_Application_Development\\src\\main\\resources\\picachu.gif");

        JButton b = new JButton(ii);
        JLabel l = new JLabel("Text", ii,LEFT);
        l.setIcon(new MyIcon());
        b.addActionListener(e -> {
        //  l.setIcon(  new ImageIcon("C:\\java_programs\\Java_Desktop_Application_Development\\src\\main\\resources\\Pig.gif"));
            //    SwingUtilities.updateComponentTreeUI(f);
            //    Random r = new Random();
          //  for (int i = 0; i < 100; i++) {
            //    ii.paintIcon(f,f.getGraphics(), r.nextInt(f.getWidth()), r.nextInt(f.getHeight()));

          //  }




        });
        SwingWorker swingWorker = new SwingWorker() {
            @Override
            protected void done() {
                System.out.println("done");
            }

            @Override
            protected Object doInBackground() throws Exception {
                ImageIcon i = new ImageIcon("C:\\java_programs\\Java_Desktop_Application_Development\\src\\main\\resources\\Pig.gif");
           return i;
            }
        };
        swingWorker.execute();




        f.add(l);
        f.add(b);




        f.setVisible(true);
    }
    public class MyIcon implements Icon{
        int w = 100;
        int h = 100;
        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            g.setColor(Color.RED);
            g.fillRect(x,y,w,h);
            g.setColor(Color.BLUE);
            g.drawString("TOO",x+30,y+(h/2));
        }

        @Override
        public int getIconWidth() {
            return w;
        }

        @Override
        public int getIconHeight() {
            return h;
        }
    }
}
