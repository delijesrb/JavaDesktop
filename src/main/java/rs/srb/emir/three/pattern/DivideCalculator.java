package rs.srb.emir.three.pattern;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DivideCalculator implements Calculator{
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        if (num2.compareTo(BigDecimal.ZERO)==0){
            throw new ArithmeticException("Division by zero in not possible");
        }  BigDecimal sum  = num1.divide(num2, RoundingMode.HALF_UP);
        return sum;
    }
}
