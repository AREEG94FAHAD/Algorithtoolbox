import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Areeg
 */

public class Last_Digit_of_the_Sum_of_Square_Fibonacci_Numbers_Again {
  private static BigInteger calc_fib(BigInteger n) {
    n = n.mod(BigInteger.valueOf(60));
    BigInteger temp = new BigInteger("0");
    BigInteger tempor = new BigInteger("0");
    BigInteger first = new BigInteger("0");
    BigInteger second = new BigInteger("1");
    BigInteger last = new BigInteger("0");

    for (BigInteger bi = BigInteger.valueOf(0); bi.compareTo(n) < 0; bi = bi.add(BigInteger.ONE)) {
      tempor = ((first).add(second));
      temp = ((second.multiply(second)));
      first = second;
      second = tempor;

      last = last.add(temp);

    }

    return last.mod(BigInteger.TEN);
  }

  public static void main(String args[]) {
    Scanner in =new Scanner(System. in );
    BigInteger firstNo = in.nextBigInteger();

    System.out.println(calc_fib(firstNo));

  }
}
