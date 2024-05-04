package rs.srb.kurs.druga.druga4;

import javax.swing.*;
import java.awt.*;

public class MyForma extends JFrame {

    private JPanel myPanel;

    public MyForma()  {
        this.setContentPane(myPanel);

    }

    public static void main(String[] args) {

        MyForma f = new MyForma();
        f.setSize(640,480);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

   /*     JPanel jp = new JPanel();

        jp.add(new JButton("Button1"));
        jp.add(new JButton("Button2"));
        jp.add(new JButton("Button3"));

        jp.setSize(200,200);
        jp.setBackground(Color.RED);

        f.add(jp);


 */

     /*   JTextArea ta = new JTextArea(10,10);
        ta.setLineWrap(true);



        JScrollPane jsp = new JScrollPane(ta);
        jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jsp.setPreferredSize(new Dimension(300,300));
        jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

       // jsp.add("text",ta);
        f.add(jsp);


      */
     /*   JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.BLUE);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.RED);

        p1.setPreferredSize(new Dimension(200,200));

        p2.setPreferredSize(new Dimension(200,200));

        splitPane.setLeftComponent(p1);

        splitPane.setRightComponent(p2);

        f.add(splitPane);


      */


       /*       JTabbedPane tp = new JTabbedPane();
              JPanel red = new JPanel();
              red.setBackground(Color.RED);
              red.setSize(200,200);
              tp.add("red",red);

              JPanel blu = new JPanel();
              blu.setPreferredSize(new Dimension(200,200));
              blu.setBackground(Color.BLUE);
              tp.add("blue",blu);

              JPanel yelow = new JPanel();
              yelow.setBackground(Color.YELLOW);
              yelow.setPreferredSize(new Dimension(200,200));
              tp.add("yellow",yelow);





              f.add(tp);

        */


          JInternalFrame internalFrame = new JInternalFrame("prozor");
          internalFrame.add(new JButton("klik"));
          internalFrame.setPreferredSize(new Dimension(300,300));
          internalFrame.setLayout(new FlowLayout());

          f.add(internalFrame);
          internalFrame.setVisible(true);

        f.setVisible(true);



    }
}
