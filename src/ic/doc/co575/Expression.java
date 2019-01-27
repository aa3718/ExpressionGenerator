package ic.doc.co575;

interface Expression extends Comparable<Expression> {

  int evaluate();

  int depth();

  boolean equals(Object e);

  int compareTo(Expression other);

}
