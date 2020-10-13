import java.math.BigInteger;
import java.util.Scanner;

public class Last_Digit_of_a_Large_Fibonacci_Number {
  private static BigInteger calc_fib(BigInteger firstNo) {
    BigInteger temp = new BigInteger("0");
    BigInteger first = new BigInteger("0");
    BigInteger second = new BigInteger("1");

    for (BigInteger bi = new BigInteger("2"); bi.compareTo(firstNo) <= 0; bi = bi.add(BigInteger.ONE)) {
      temp = ((first).add(second)).mod(BigInteger.TEN);
      //      temp=temp.multiply(temp);
      first = second;
      second = temp;

    }

    return temp.mod(BigInteger.TEN);
  }

  public static void main(String args[]) {
    Scanner in =new Scanner(System. in );
    BigInteger firstNo = in.nextBigInteger();

    System.out.println(calc_fib(firstNo));

  }
}