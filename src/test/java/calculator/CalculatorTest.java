package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void ShouldReturnZeroWhenNoValueIsGiven() {
        Calculator calculator = new Calculator();
        double sum = calculator.sum();

        Assertions.assertEquals(0, sum);
    }

    @Test
    public void ShouldReturnTheSumOfTheGivenNumbers() {
        Calculator calculator = new Calculator();
        double sum = calculator.sum(9.12, 3);

        Assertions.assertEquals(12.12, sum);
    }

    @Test
    public void ShouldThrowExeptionWhenTheGivenNumberIsZero() {
        Calculator calculator = new Calculator();
        IllegalArgumentException exception =  Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));

        Assertions.assertEquals("Doesn't exist square root fot negative numbers", exception.getMessage());
    }

    @Test
    public void ShouldReturnTheSquareRootOfTheGivenNumber() {
        Calculator calculator = new Calculator();

        double squareRoot = calculator.squareRoot(5);

        Assertions.assertEquals(Math.sqrt(5), squareRoot);
    }

    @Test
    public void ShouldReturnTrueWhenTheGivenNumberIsOdd() {
        Calculator calculator = new Calculator();

        boolean isOdd = calculator.isOdd(5);

        Assertions.assertTrue(isOdd);
    }

    @Test
    public void ShouldReturnFalseWhenTheGivenNumberIsntOdd() {
        Calculator calculator = new Calculator();

        boolean isOdd = calculator.isOdd(6);

        Assertions.assertFalse(isOdd);
    }
}
