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
public class maxsalary {

  static void max(int n, ArrayList salary) {

    int a = 0;
    int b = 0;
    String res = "";
    String g = "";
    String stra = "";
    String strb = "";
    String ij = "";
    String ji = "";
    int iijj = 0;
    int jjii = 0;
    int koko = 0;

    ArrayList < String > sort = new ArrayList < String > (n);
    for (int i = 0; i < salary.size(); i++) {

      for (int j = i + 1; j < salary.size(); j++) {
        a = (int) salary.get(i);
        b = (int) salary.get(j);
        stra = Integer.toString(a);
        strb = Integer.toString(b);
        ij = stra + strb;
        ji = strb + stra;

        iijj = Integer.parseInt(ij);
        jjii = Integer.parseInt(ji);

        if (iijj < jjii) {
          koko = (int) salary.get(i);
          salary.set(i, salary.get(j));
          salary.set(j, koko);

        }

      }
      //            String gg=Integer.toString(b);
      //            sort.add(gg);

    }
    for (int h = 0; h < salary.size(); h++) {
      System.out.print(salary.get(h));
    }

  }

  public static void main(String[] args) {
    Scanner in =new Scanner(System. in );
    int n = in.nextInt();
    ArrayList < Integer > salary = new ArrayList < Integer > (n);

    for (int i = 0; i < n; i++) {
      salary.add(i, in.nextInt());
    }

    max(n, salary);
  }
}