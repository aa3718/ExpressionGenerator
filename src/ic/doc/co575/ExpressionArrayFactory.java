package ic.doc.co575;

import java.util.Arrays;

public class ExpressionArrayFactory {

  public static Expression[] randomExpressionArray(int maxSize, int maxDepth) {

    Expression[] arrayExpressions = new Expression[maxSize];

    Expression it;

    for (int i = 0; i < maxSize; i++) {
      it = ExpressionFactory.randomExpression(maxDepth);
      arrayExpressions[i] = it;
    }
    Arrays.sort(arrayExpressions);

    return arrayExpressions;
  }
}
