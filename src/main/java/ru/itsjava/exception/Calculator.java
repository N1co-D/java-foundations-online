package ru.itsjava.exception;

public class Calculator {

    public int division(int num, int divider) throws CalculatorException {
        try {
            return num / divider;
        } catch (ArithmeticException arithmeticException) {
            throw new CalculatorException("Деление на ноль!");
        }
    }
}
