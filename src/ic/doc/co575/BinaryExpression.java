package ic.doc.co575;

public abstract class BinaryExpression implements Expression {

  protected int left;
  protected int right;
  protected Expression leftExp;
  protected Expression rightExp;
  protected int depth;

  public BinaryExpression(Expression left1, Expression right1) {
    leftExp = left1;
    rightExp = right1;
    left = left1.evaluate();
    right = right1.evaluate();
  }

  @Override
  public abstract String toString();

  public abstract int evaluate();

  public abstract int depth();
  /*
  depth = Math.max(left_exp.depth(), right_exp.depth()) + 1;
  return depth;
  */

  public Expression getLeft() {

    return leftExp;
  }

  public Expression getRight() {
    return rightExp;
  }

  public boolean equals(Object e) {
    if (this.evaluate() == ((Expression) e).evaluate()) {
      return true;
    }
    return false;
  }

  public abstract int compareTo(Expression other);
}
