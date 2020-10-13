import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Areeg
 */

public class Fibonacci_Number_Again {
  private static int calculate_m(int m) {

    int a = 0;
    int b = 1;
    int c = 0;

    for (int i = 0; i < m * m; i++) {
      c = (a + b) % m;
      a = b;
      b = c;
      if (a == 0 && b == 1) {

        return c = i + 1;
      }
    }
    return 0;
  }

  static BigInteger calculate_f(BigInteger f, int m) {
 
    f = f.mod(BigInteger.valueOf((calculate_m(m))));
    if (f.equals(BigInteger.valueOf(1)) || (f.equals(BigInteger.valueOf(0)))) {
      return f;
    }
    int fAfthermod = f.intValue();

    BigInteger[] first = new BigInteger[fAfthermod];
    first[0] = BigInteger.ZERO;
    first[1] = BigInteger.ONE;

    for (int i = 2; i < fAfthermod; i++) {
      first[i] = (first[i - 1].add(first[i - 2]).mod(BigInteger.valueOf(m)));

    }
    return (first[fAfthermod - 1].add(first[fAfthermod - 2]).mod(BigInteger.valueOf(m)));
  }

  public static void main(String args[]) {
    Scanner in =new Scanner(System. in );
    BigInteger n = in.nextBigInteger();
    int m = in.nextInt();

    System.out.println(calculate_f(n, m));

  }
}
