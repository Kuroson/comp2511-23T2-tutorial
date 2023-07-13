package calculator;

import calculator.Expression.Expression;

public class Calculator {
    private Expression e;

    public Calculator(Expression e) {
        this.e = e;
    }

    public double calculate() {
        return this.e.compute();
    }
}
