import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Areeg
 */

public class Fibonacci {
    private static BigInteger calc_fib(BigInteger firstNo, BigInteger SecondNo) {
        BigInteger temp = new BigInteger("0");
        BigInteger comp = new BigInteger("1");
        BigInteger first = new BigInteger("0");
        BigInteger last = new BigInteger("1");
        BigInteger second = new BigInteger("1");


        if (firstNo.compareTo(BigInteger.valueOf(5618252)) >= 0) {
            SecondNo = SecondNo.mod(BigInteger.valueOf(100));
            firstNo = firstNo.mod(BigInteger.valueOf(100));

        }
        firstNo = firstNo.mod(BigInteger.valueOf(60));
        SecondNo = SecondNo.mod(BigInteger.valueOf(60));



        if (firstNo.equals(BigInteger.ZERO) && SecondNo.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }

        if ((firstNo.compareTo(BigInteger.valueOf(0)) == 0)) {

            for (BigInteger bi = BigInteger.valueOf(1); bi.compareTo(SecondNo) < 0; bi = bi.add(BigInteger.ONE)) {

                temp = first.add(second);
                first = second;
                second = temp;
                last = last.add(temp);

            }
            return last.mod(BigInteger.TEN);
        }

        if (firstNo.equals(comp)) {


            for (BigInteger bi = BigInteger.valueOf(1); bi.compareTo(SecondNo) < 0; bi = bi.add(BigInteger.ONE)) {

                temp = first.add(second);
                first = second;
                second = temp;
                last = last.add(temp);

            }
            return last.mod(BigInteger.TEN);
        }

        for (BigInteger bi = BigInteger.valueOf(2); bi.compareTo(firstNo) < 0; bi = bi.add(BigInteger.ONE)) {
            temp = first.add(second);
            first = second;
            second = temp;
            last = last.add(temp);

        }

        temp = BigInteger.valueOf(0);
        last = BigInteger.valueOf(0);

        for (BigInteger bi = firstNo; bi.compareTo(SecondNo) <= 0; bi = bi.add(BigInteger.ONE)) {
            temp = first.add(second);
            first = second;
            second = temp;
            last = last.add(temp);

        }



        return last.mod(BigInteger.TEN);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        BigInteger firstNo = in .nextBigInteger();
        BigInteger SecondNo = in .nextBigInteger();

        System.out.println(calc_fib(firstNo, SecondNo));



    }
}
