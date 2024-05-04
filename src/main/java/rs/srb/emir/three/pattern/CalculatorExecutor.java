package rs.srb.emir.three.pattern;

import java.math.BigDecimal;

public class CalculatorExecutor {
    private Calculator calculator;

    public BigDecimal executeCalculator(BigDecimal n1 , BigDecimal n2){
        return calculator.calculate(n1,n2);
    }

    public CalculatorExecutor(Calculator calculator) {
        this.calculator = calculator;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public CalculatorExecutor() {
    }
}
