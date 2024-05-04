package rs.srb.emir.three.pattern;

import java.math.BigDecimal;

public class MultiplayCalculator implements Calculator{
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
}
