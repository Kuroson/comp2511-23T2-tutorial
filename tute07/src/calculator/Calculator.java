package calculator;

import calculator.Expression.Expression;

public class Calculator {
    private Expression expression;

    public Calculator(Expression e) {
        this.expression = e;
    }

    public double calculate() {
        return this.expression.compute();
    }

}
