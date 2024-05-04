package rs.srb.emir.three.pattern;

import javax.swing.*;
import java.math.BigDecimal;

public class Tester {
    public static void main(String[] args) {
        Calculator calculator = new DivideCalculator();
        CalculatorExecutor calculatorExecutor = new CalculatorExecutor();
        calculatorExecutor.setCalculator(new MultiplayCalculator());
        BigDecimal value = calculatorExecutor.executeCalculator(BigDecimal.valueOf(35),BigDecimal.ZERO);
        JOptionPane.showMessageDialog(null,value);
    }
}
