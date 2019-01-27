package ic.doc.co575;

public abstract class BinaryExpression implements Expression {

  protected int left;
  protected int right;
  protected Expression left_exp;
  protected Expression right_exp;
  protected int depth;

  public BinaryExpression(Expression left1, Expression right1) {
    left_exp = left1;
    right_exp = right1;
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

    return left_exp;
  }

  public Expression getRight() {
    return right_exp;
  }

  public boolean equals(Object e) {
    if (this.evaluate() == ((Expression) e).evaluate()) {
      return true;
    }
    return false;
  }

  public abstract int compareTo(Expression other);

  }
