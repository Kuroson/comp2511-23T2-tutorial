package calculator.Expression;

import java.util.List;

/**
 * Composite
 */
public class CompositeExpression implements Expression {
    private Expression e1;
    private Expression e2;
    private String operation;

    public CompositeExpression(Expression e1, Expression e2, String operation) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double compute() {
        if (this.operation.equals("+")) {
            return e1.compute() + e2.compute();
        } else if (this.operation.equals("-")) {
            return e1.compute() - e2.compute();
        }
        return 0;
    }

    public static void main(String[] args) {
        CompositeExpression c = new CompositeExpression(new Number(1), new Number(2), "+");
    }
}
