package rs.srb.kurs.prva.prva5;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    private TextField display;
    private String operator;
    private double num1, num2, result;

    public Calculator() {
        operator = "";
        num1 = 0;
        num2 = 0;
        result = 0;

        setLayout(new BorderLayout());

        display = new TextField(10);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setTitle("Calculator");
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }

            display.setText(Double.toString(result));
            operator = "";
        } else {
            if (!operator.equals("")) {
                return;
            }
            operator = command;
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}