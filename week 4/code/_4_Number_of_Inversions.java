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
public class _4_Number_of_Inversions {
  static int mergeSort(int a[], int n) {
    if (n == 1) {
      return 0;
    }

    int m = (int) Math.floor(n / 2);
    int[] a1 = new int[m];
    int[] a2 = new int[n - m];
    for (int i = 0; i < m; i++) {
      a1[i] = a[i];
    }
    for (int i = 0; i < n - m; i++) {
      a2[i] = a[i + m];
    }

    int inv = 0;
    inv += mergeSort(a1, m);

    inv += mergeSort(a2, n - m);
    inv += merge(a, a1, a2, m, n - m);
    return inv;

  }

  public static int merge(
  int[] a, int[] l, int[] r, int m, int high) {

    int i = 0,
    j = 0,
    k = 0;
    int pairs = 0;
    while (i < m && j < high) {
      if (l[i] <= r[j]) {
        a[k] = l[i];
        i++;
        k++;
      } else {
        a[k] = r[j];
        // if 1 4 5 6 and 1 2 1 2 , 4 is more than 1 that mean all value after 4 is more than 1 so 
        //the inverstion increaseby all value than يعني الاربعه اكبرمن 1 معناتها كل قيم بعدها هيه اكبر فتزدا
        
        pairs = pairs + (m - i);
        j++;
        k++;
      }
    }
    for (int w = i; w < m; w++) {
      a[k] = l[w];
      k++;
    }
    for (int w = j; w < high; w++) {
      a[k] = r[w];
      k++;
    }
    return pairs;
  }

  public static void main(String[] args) {
    Scanner in =new Scanner(System. in );
    int n = in.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = in.nextInt();

    }

    System.out.print(mergeSort(array, n));

  }

}