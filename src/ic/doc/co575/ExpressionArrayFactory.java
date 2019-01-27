package ic.doc.co575;

import java.util.Arrays;

public class ExpressionArrayFactory {

  public static Expression[] randomExpressionArray(int maxSize, int maxDepth) {

    Expression[] arrayExpressions = new Expression[maxSize];

    Expression it = null;

    for (int i = 0; i < maxSize; i++) {
      it = ExpressionFactory.randomExpression(maxDepth);
      arrayExpressions[i] = it;
    }
    Arrays.sort(arrayExpressions);

/*
    for (int i = 0; i < maxSize; i++) {
      for (int j = i; j < maxSize; j++) {
        if (arrayExpressions[i].evaluate() > arrayExpressions[j].evaluate()) {
          Expression temp = arrayExpressions[i];
          arrayExpressions[i] = arrayExpressions[j];
          arrayExpressions[j] = temp;
        }
      }
    }
*/
    return arrayExpressions;
  }
}
