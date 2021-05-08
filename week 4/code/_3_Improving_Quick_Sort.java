import java.util.Arrays;
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
public class _3_Improving_Quick_Sort {
  static int[] arraysort(int array[], int low, int high) {

    if (low < high) {

      int m = Partitions(array, low, high);

      arraysort(array, m + 1, high);
      arraysort(array, low, m - 1);
    }

    return array;
  }

  static int Partitions(int array[], int low, int high) {
    int x = array[low];
    int j = low;
    for (int i = low + 1; i <= high; i++) {
      if (array[i] <= x) {
        j = j + 1;
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

      }
    }
    int tempMid = array[low];
    array[low] = array[j];
    array[j] = tempMid;

    return j;
  }

  public static void main(String[] args) {
    Scanner in =new Scanner(System. in );
    int n = in.nextInt();
    int array[] = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = in.nextInt();
    }
    int sortedArr[] = arraysort(array, 0, n - 1);
    //       Arrays.sort(array);

    for (int i = 0; i < n; i++) {
      System.out.print(sortedArr[i] + " ");
    }
  }
}