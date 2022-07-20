package pro.sky.java.course2.calculator.calculator.servise;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
            return num1 / num2;
    }
}
