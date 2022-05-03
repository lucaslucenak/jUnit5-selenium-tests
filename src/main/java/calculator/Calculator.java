package calculator;

public class Calculator {
    public Double sum(double... numbers) {
        double sum = 0;

        if (numbers.length > 0 ) {
            for (double number : numbers) {
                sum += number;
            }
        }
        return sum;
    }

    public Boolean isOdd(double num) {
        return num % 2 != 0;
    }

    public Double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Doesn't exist square root fot negative numbers");
        }
        return Math.sqrt(num);
    }
}
