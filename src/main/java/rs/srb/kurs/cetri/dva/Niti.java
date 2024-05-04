package rs.srb.kurs.cetri.dva;

import rs.srb.kurs.cetri.jedan.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Niti extends JFrame{
    private JPanel my;

    public Niti() {
        this.setContentPane(my);
    }

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {

        Runnable myGUI = new Runnable() {
            @Override
            public void run() {
                Niti f = new Niti();
                f.setSize(640,400);
                f.setLocationRelativeTo(null);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
                JLabel size = new JLabel();
                JLabel location = new JLabel();
                f.add(location);
                f.add(size);
                JButton b = new JButton();
                f.add(b);
                JTextField jTextField = new JTextField(50);
                f.add(jTextField);
                f.setVisible(true);
                long du = 10000000l;
                JLabel l = new JLabel();
                f.add(l);


                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        SwingWorker sw = new SwingWorker() {
                            @Override
                            protected Object doInBackground() throws Exception {
                                for (int i = 0; i <du; i++)
                                    if (i%1000 ==0){
                                       int proc = (int)((double)i/(double) du * 100);
                                       publish("complete"+proc);
                                    }



                                return  null;
                            }

                            @Override
                            protected void done() {
                                System.out.println("done work");
                            }

                            @Override
                            protected void process(List chunks) {

                                for (int i = 0; i < chunks.size(); i++) {
                                    System.out.println(chunks.get(i).toString());
                                    l.setText(chunks.get(i).toString());
                                    l.repaint();
                                }

                            }
                        };
                        sw.execute();
                        sw.cancel(true);
                    }
                });
         /*       b.addActionListener(new ActionListener() {
                    @Override
                public void actionPerformed(ActionEvent e) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i <10000000; i++) {
                                System.out.println(i);

                            }

                        }   });
                    thread.start();
                    }
                });

          */

            }
        };


        SwingUtilities.invokeAndWait(myGUI);
    }
}
