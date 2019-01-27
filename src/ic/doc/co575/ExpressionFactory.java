package ic.doc.co575;

import java.util.Random;

public class ExpressionFactory {

  // static
  public static Expression randomExpression(int maxDepth) {

    Random rdm = new Random();

    if (maxDepth == 0) {
      try {
        int n = rdm.nextInt(9) + 1;
        return new NaturalNumber(n);
      } catch (InvalidNaturalNumber e) {
        System.out.println("Got you before!");
        return new NaturalNumber(0);
      }
    } else {

      int dleft = rdm.nextInt(maxDepth) + 1;
      int dright = rdm.nextInt(maxDepth) + 1;

      int randOpe = rdm.nextInt(3) + 0;
      // System.out.println("randOpe");
      // System.out.println(randOpe);
      try {

        switch (randOpe) {
          case 0:
            return new Addition(randomExpression(dleft - 1), randomExpression(dright - 1));

          case 1:
            return new Subtraction(randomExpression(dleft - 1), randomExpression(dright - 1));

          case 2:
            return new Division(randomExpression(dleft - 1), randomExpression(dright - 1));

          case 3:
            return new Product(randomExpression(dleft - 1), randomExpression(dright - 1));

          default:
            System.out.println("Default switch case reached");
            break;
        }
      } catch (InvalidNaturalNumber e) {

        System.out.println("Got ya!");

        return new NaturalNumber(1);
      }
    }
    return new NaturalNumber(1);
  }
}
