package ic.doc.co575;

public class Addition extends BinaryExpression {

  public Addition(Expression left, Expression right) {
    super(left, right);

  }

  /*private final int value;

  public Addition(Expression left, Expression right) {

    value = left.evaluate() + right.evaluate();
  }*/

  NaturalNumber Nn = new NaturalNumber(left + right);

  @Override
  public String toString() {
    return String.valueOf(this.evaluate());
  }

  public int evaluate() {
    return Nn.evaluate();

    // return this.left + this.right;
  }

  public int depth() {
    this.depth = Math.max(this.left_exp.depth(), this.right_exp.depth()) + 1;
    return this.depth;
  }

  public int compareTo(Expression other) {

    if (this.evaluate() > other.evaluate()) {
      return 1;
    } else if (this.evaluate() < other.evaluate()) {
      return -1;
    } else {
      return 0;
    }
  }
}
