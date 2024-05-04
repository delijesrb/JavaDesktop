package rs.srb.kurs.cetri.jedan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
    private JPanel myPanel;
    private JTextField textField1;
    private JTextField textField2;

    public Main() {
        this.setContentPane(myPanel);
        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                textField2.setText(textField1.getText());
            }
        });
    }

    public static void main(String[] args) {
        Main f = new Main();
        f.setSize(640,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        JLabel size = new JLabel();
        JLabel location = new JLabel();
        f.add(location);
        f.add(size);

        Main f1 = new Main();
        f1.setSize(640,400);

        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        JButton b = new JButton("B");

        f.add(b);



        /*

        f.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                Component component =e.getComponent();
                size.setText("Width: "+component.getWidth()+ " Height: "+ component.getHeight());

            }

            @Override
            public void componentMoved(ComponentEvent e) {

            Component component = e.getComponent();
            Point p = component.getLocationOnScreen();
            location.setText(String.valueOf(p.getY()));
            }

            @Override
            public void componentShown(ComponentEvent e) {
                JOptionPane.showMessageDialog(null,"show");

            }

            @Override
            public void componentHidden(ComponentEvent e) {
                JOptionPane.showMessageDialog(null,"hide");

            }
        });  /*
       f.addKeyListener(new KeyListener() {
           @Override
           public void keyTyped(KeyEvent e) {

           }

           @Override
           public void keyPressed(KeyEvent e) {
               System.out.println(e.getKeyCode());

           }

           @Override
           public void keyReleased(KeyEvent e) {

           }
       });
       f.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               System.out.println("clicked on");
           }

           @Override
           public void mousePressed(MouseEvent e) {

           }

           @Override
           public void mouseReleased(MouseEvent e) {

           }

           @Override
           public void mouseEntered(MouseEvent e) {
               System.out.println("entered");
           }

           @Override
           public void mouseExited(MouseEvent e) {
               System.out.println("exit");

           }
       });

       f.addMouseMotionListener(new MouseMotionListener() {
           @Override
           public void mouseDragged(MouseEvent e) {

           }

           @Override
           public void mouseMoved(MouseEvent e) {
            size.setText("x"+ e.getXOnScreen()+"y"+e.getY());
           }
       });

       f.addMouseWheelListener(new MouseWheelListener() {
           @Override
           public void mouseWheelMoved(MouseWheelEvent e) {
              if (e.getWheelRotation()>0){
                  f.setLocation(new Point(f.getLocation().x,f.getLocation().y+5));
              }else {
                  f.setLocation(new Point(f.getLocation().x,f.getLocation().y-5));
              }

           }
       });


        b.addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {
                System.out.println("Hierarchy change for :" + e.getChangedParent());

            }
        }); */
        b.addHierarchyBoundsListener(new HierarchyBoundsListener() {
            @Override
            public void ancestorMoved(HierarchyEvent e) {
                System.out.println("moved");
            }

            @Override
            public void ancestorResized(HierarchyEvent e) {
                System.out.println("resize");
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.remove(b);
                f.repaint();
                f1.add(b);
            }
        });




          f.setVisible(true);
          f1.setVisible(true);

    }
}
