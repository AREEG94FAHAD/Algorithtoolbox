import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Areeg
 */
public class Fibonacci_Number {

  static long FibonacciNumber(int a) {
      if (a<=1){
          return a;
      }
    long[] fibonacci = new long[(int) a];
    fibonacci[0] = 0;
    fibonacci[1] = 1;

    for (int i = 2; i < fibonacci.length; i++) {

      fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

    }
    return fibonacci[a - 1] + fibonacci[a - 2];
  }

  public static void main(String[] args) {
    Scanner in =new Scanner(System. in );
    int a = in.nextInt();

    System.out.println(FibonacciNumber(a));

  }
}