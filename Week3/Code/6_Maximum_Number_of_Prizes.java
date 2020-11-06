import java.util.ArrayList;
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
public class maximinm {

  static ArrayList < Integer > maximum(int num) {
    int loop = num;

    ArrayList < Integer > a = new ArrayList < Integer > ();
    if (num == 1) {
      a.add(num);
      return a;
    }

    for (int i = 1; i < loop; i++) {
      num -= i;
      if (num > i) {
        a.add(i);

      }
      if (num <= i) {
        a.add(i + num);
        //                System.out.print(a);
        return a;

      }

    }
    a.clear();
    return null;

  }

  public static void main(String[] args) {
    Scanner in =new Scanner(System. in );
    int x = in.nextInt();
    ArrayList < Integer > a = new ArrayList < Integer > ();
    a = maximum(x);
    System.out.println(a.size());
    for (int i = 0; i < a.size(); i++) {
      System.out.print(a.get(i) + " ");
    }

    in .close();
  }
}