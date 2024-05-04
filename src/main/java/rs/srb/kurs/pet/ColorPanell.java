package rs.srb.kurs.pet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ColorPanell extends JPanel {
    private final JRadioButton onTimeButton;
    private final JRadioButton countDownButton;

    private final JTextField onTimeTextField;
    private final JTextField countDownTextField;
    private final JButton chooseColorButton;
    private final JLabel timeLabel;
    private final JLabel speedLabel;
    private final JComboBox<String> speedComboBox;
    private final JButton startButton;
    private final JButton stopButton;
    private int timerTime;
    private Timer timer;
    private Timer timer2;

    private final JFrame colorFrame;
    private Integer countdown = 5;
    private SwingWorker<Void, Void> timerWorker;
    private SwingWorker<Void, Void> timeWorker;

    public ColorPanell() {
        setLayout(new GridLayout(4, 0));

        this.onTimeButton = new JRadioButton("On Time");
        this.countDownButton = new JRadioButton("Count Down");
        ButtonGroup timeButtonGroup = new ButtonGroup();
        timeButtonGroup.add(onTimeButton);
        timeButtonGroup.add(countDownButton);

        onTimeButton.setBackground(Color.white);
        countDownButton.setBackground(Color.WHITE);
        this.timerTime = 1000;

        this.onTimeTextField = new JTextField();
        this.countDownTextField = new JTextField();

        JPanel selectTimePanel = new JPanel(new GridLayout(2, 2));
        selectTimePanel.add(onTimeButton);
        selectTimePanel.add(onTimeTextField);
        selectTimePanel.add(countDownButton);
        selectTimePanel.add(countDownTextField);
        selectTimePanel.setBackground(Color.white);

        this.chooseColorButton = new JButton("Choose Color");
        this.chooseColorButton.addActionListener(new ColorChooserAction());
        this.timeLabel = new JLabel();
        updateTime();

        JPanel colorChooserPanel = new JPanel(new FlowLayout());
        colorChooserPanel.add(chooseColorButton);
        colorChooserPanel.add(timeLabel);
        colorChooserPanel.setBackground(Color.WHITE);

        this.speedLabel = new JLabel("Choose speed");
        this.speedComboBox = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});
        this.speedComboBox.addItemListener(new TimerChooserAction());

        JPanel speedChooserPanel = new JPanel(new FlowLayout());
        speedChooserPanel.add(speedLabel);
        speedChooserPanel.add(speedComboBox);

        speedChooserPanel.setBackground(Color.WHITE);

        this.startButton = new JButton("Start Countdown");
        this.startButton.addActionListener(new StartAction());
        this.stopButton = new JButton("STOP");
        this.stopButton.addActionListener(new StopAction());
        JPanel startStopButtonPanel = new JPanel(new FlowLayout());
        startStopButtonPanel.setBackground(Color.RED);
        startStopButtonPanel.setSize(new Dimension(300, 100));
        startStopButtonPanel.add(startButton);
        startStopButtonPanel.add(stopButton);

        selectTimePanel.setBorder(BorderFactory.createEmptyBorder(20, 25, 25, 25));
        add(selectTimePanel, TOP_ALIGNMENT);
        add(colorChooserPanel, CENTER_ALIGNMENT);
        add(speedChooserPanel);
        add(startStopButtonPanel);
        this.colorFrame = new JFrame();
        this.colorFrame.setSize(200, 400);
    }

    public class ColorChooserAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Color color = JColorChooser.showDialog(ColorPanell.this, "Choose Color", Color.BLACK);
            colorFrame.getContentPane().setBackground(color);

            if (timer != null) {
                timer.stop();
            }

            timer = new Timer(timerTime, new ActionListener() {
                boolean isWhite = true;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isWhite) {
                        colorFrame.getContentPane().setBackground(color);
                    } else {
                        colorFrame.getContentPane().setBackground(Color.WHITE);
                    }
                    isWhite = !isWhite;
                    System.out.println(timerTime);
                }
            });
            timer.start();
        }
    }

    private void updateTime() {
        if (timeWorker != null && !timeWorker.isDone()) {
            return;
        }

        timeWorker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                while (true) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                    String time = dateFormat.format(new Date());
                    timeLabel.setText(time);
                    Thread.sleep(1000);
                }
            }
        };
        timeWorker.execute();
    }

    public class StartAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startButton.setEnabled(false);
            onTimeButton.setEnabled(false);
            countDownButton.setEnabled(false);
            chooseColorButton.setEnabled(false);
            speedComboBox.setEnabled(false);

            int selectedTime = Integer.parseInt(onTimeTextField.getText());
            countdown = selectedTime;

            timer2 = new Timer(1000, et -> {
                countdown--;
                onTimeTextField.setText(Integer.toString(countdown));
                System.out.println("Countdown: " + countdown);
                if (countdown == 0) {
                    colorFrame.setVisible(true);
                    timer2.stop();
                }
            });
            timer2.start();
        }
    }

    public class StopAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (timer2 != null) {
                timer2.stop();
            }
            startButton.setEnabled(true);
            onTimeButton.setEnabled(true);
            countDownButton.setEnabled(true);
            chooseColorButton.setEnabled(true);
            speedComboBox.setEnabled(true);
        }
    }

    public class TimerChooserAction implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            int index = speedComboBox.getSelectedIndex();
            switch (index) {
                case 0 -> timerTime = 1000;
                case 1 -> timerTime = 2000;
                case 2 -> timerTime = 3000;
                case 3 -> timerTime = 4000;
                case 4 -> timerTime = 5000;
            }
        }
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ColorPanell colorPanell = new ColorPanell();
        frame.add(colorPanell);
        frame.pack();
        frame.setVisible(true);
    }


}
