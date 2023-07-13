package calculator.Expression;

/**
 * Composite
 */
public class AdditionExpression implements Expression {
    private Expression e1; // a leaf node or a composite node
    private Expression e2; // right

    public AdditionExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double compute() {
        return this.e1.compute() + this.e2.compute();
    }
}
