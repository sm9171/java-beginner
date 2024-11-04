package calculator;

import calculator.io.InputHandler;
import calculator.io.OutputHandler;

import java.io.IOException;

public class Calculator {
    public void start() throws IOException {
        OutputHandler.printStart();

        String[] inputs = InputHandler.getInputs();
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[2]);
        String operator = inputs[1];

        int result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    OutputHandler.printDivideWithZero();
                    return;
                }
                result = a / b;
                break;
            default:
                OutputHandler.printInvalidOperator();
                break;
        }
        OutputHandler.printResult(result);
        OutputHandler.printEnd();
    }
}
