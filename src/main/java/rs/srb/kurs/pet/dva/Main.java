package rs.srb.kurs.pet.dva;

import rs.srb.kurs.pet.jedan.ImageIkoni;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class Main extends JFrame {
    private JPanel main;
    private JSpinner spinner1;

    public Main()  {
        this.setContentPane(main);

    }

    public static void main(String[] args) {
        JFrame f = new Main();
        f.setSize(640,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

        JSpinner mm = new JSpinner(new SpinnerNumberModel(5,5,100,5));
//        SpinnerNumberModel nm = new SpinnerNumberModel();

//        mm.setModel(nm);
        f.add(mm);
//        mm.setValue(5);
//        nm.setMaximum(10);
//        nm.setMinimum(2);
//        nm.setStepSize(2);
        JSpinner dm = new JSpinner();

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR,-5);
        Date min = cal.getTime();
        cal.add(Calendar.YEAR,5);
        Date max = cal.getTime();
        SpinnerDateModel sdm = new SpinnerDateModel(cal.getTime(),min,max,Calendar.DATE);

        dm.setModel(sdm);
        dm.setEditor(new JSpinner.DateEditor(dm,"dd.MMM.yy hh:mm"));
        f.add(dm);

        SpinnerListModel slm = new SpinnerListModel(new String[]{"a","b"});
        JSpinner s = new JSpinner(slm);
        f.add(s);
        dm.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSpinner s = (JSpinner) e.getSource();
                System.out.println(s.getValue());
            }
        });



        f.setVisible(true);
    }
}
