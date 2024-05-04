package rs.srb.emir.three.pattern;

import java.math.BigDecimal;

public class SumCalculator implements Calculator{
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        BigDecimal suma = num1.add(num2);
        return  suma;
    }
}
