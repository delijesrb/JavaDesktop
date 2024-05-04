package rs.srb.emir.three;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComboBoxPanel extends JPanel {

    static final String[] datePattern = {
            "dd MM yyyy",
            "dd.MM.yy",
            "yyyy.mm.dd G 'at' hh:mm:ss z",
            "H:mm:ss:SSSS",
            "yyyy.MMMMM.dd GGG hh.mm aaa"

    };

    private final JLabel patternLabel1 = new JLabel("Unesi pattern datuma ili");
    private final JLabel patternLabel2 = new JLabel("odaberi jedan datum iz liste");

    private final JComboBox<String> dateTimePatternComboBox = new JComboBox<>(datePattern);
    private final JLabel resultLabel = new JLabel("Trenuti datu/vreme",JLabel.LEADING);
    private JLabel resultTextLabel = new JLabel();
    private String selectedPattern = datePattern[0];

    ComboBoxLisinter comboBoxLisinter = new ComboBoxLisinter(this::reformedDateTime);

    public ComboBoxPanel() {
        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        JPanel patternPanle = new JPanel();
        patternPanle.setLayout(new BoxLayout(patternPanle,BoxLayout.PAGE_AXIS));

        JPanel resultPanle = new JPanel(new GridLayout(0,1));
        dateTimePatternComboBox.addActionListener(comboBoxLisinter);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,30));
        patternPanle.add(patternLabel1);
        patternPanle.add(patternLabel2);
        dateTimePatternComboBox.setAlignmentX(LEFT_ALIGNMENT);
        patternPanle.add(dateTimePatternComboBox);

        dateTimePatternComboBox.setEditable(true);

        patternPanle.setAlignmentX(LEFT_ALIGNMENT);
        add(patternPanle);
        add(Box.createRigidArea(new Dimension(0,15)));

        resultPanle.add(resultLabel);
        resultPanle.add(resultTextLabel);
        resultTextLabel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.RED,3),
                BorderFactory.createEmptyBorder(5,5,5,5)));
        add(resultPanle);
        reformedDateTime(selectedPattern);

    }
    private void reformedDateTime(String selectedPattern){
        Date today = new Date() ;

        try{ SimpleDateFormat formatter = new SimpleDateFormat(selectedPattern);
            String formattedDateTime = formatter.format(today);
            resultTextLabel.setText(formattedDateTime);
            resultTextLabel.setForeground(Color.BLACK);
        }catch (IllegalArgumentException e){
            resultTextLabel.setForeground(Color.RED);
            resultTextLabel.setText("Error: "+e.getMessage());
        }

    }

}
