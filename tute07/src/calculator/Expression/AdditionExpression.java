package calculator.Expression;

import java.util.List;

/**
 * Composite
 */
public class AdditionExpression implements Expression {
    private Expression e1; // left
    private Expression e2; //right

    public AdditionExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double compute() {
        return e1.compute() + e2.compute();
    }
}
