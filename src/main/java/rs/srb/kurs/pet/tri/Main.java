package rs.srb.kurs.pet.tri;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Main extends JFrame{
    private JPanel main;
    private JComboBox comboBox1;
    private JRadioButton time;
    private JRadioButton stoperica;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton countdownButton;
    private JButton stopButton;
    static int duration = 100000;

    private JSpinner spinner1;

    public Main() {
        this.setContentPane(main);

    }

    public static void main(String[] args) {
        JFrame f = new Main();
        f.setSize(640, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        /*JButton b = new JButton("start" );
        f.add(b);
        JProgressBar jpb = new JProgressBar(0,duration);
        f.add(jpb);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker swingWorker =new SwingWorker() {
                    @Override
                    protected Object doInBackground() throws Exception {
                        for (int i =0 ; i <duration; i++){
                            Thread.sleep(1);

                            if (i%100==0){
                                publish(i);
                            }
                        }return null;
                    }

                    @Override
                    protected void done() {
                        System.out.println("job  done");
                    }

                    @Override
                    protected void process(List chunks) {
                         jpb.setValue((int) chunks.get(chunks.size()-1));
                    }
                }
                ;swingWorker.execute();
            }
        });*/

        JSlider slider = new JSlider(0,1000,125);
        f.add(slider);
        slider.setMajorTickSpacing(100);
        slider.setMinorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setPreferredSize(new Dimension(500,100));
        slider.setPaintTicks(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider jSlider = (JSlider) e.getSource();
                System.out.println(jSlider.getValue());
            }
        });


        JSpinner n = new JSpinner(new SpinnerNumberModel(101,4,100,101));
        f.add(n);

        f.setVisible(true);
    }
}