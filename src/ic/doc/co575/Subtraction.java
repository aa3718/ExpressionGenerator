package ic.doc.co575;

public class Subtraction extends BinaryExpression {

  public Subtraction(Expression left, Expression right) {
    super(left, right);
  }

  private NaturalNumber natNum = new NaturalNumber(left - right);

  public int evaluate() {
    return natNum.evaluate();
  }

  public int depth() {
    this.depth = Math.max(this.leftExp.depth(), this.rightExp.depth()) + 1;
    return this.depth;
  }

  @Override
  public String toString() {
    return String.valueOf(this.evaluate());
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
