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
public class NewClass {

  static long Least_Common_Multiple(long a, long b) {
    long c = 0;

    for (int i = 1;i<a*b; i++) {

      c = i * a;
      if (c % b == 0) {
        return c;
      }

    }
return 0;
  }

  public static void main(String[] args) {
    Scanner in =new Scanner(System. in );
    long a = in.nextLong();
    long b = in.nextLong();
    System.out.println(Least_Common_Multiple(a, b));

  }
}