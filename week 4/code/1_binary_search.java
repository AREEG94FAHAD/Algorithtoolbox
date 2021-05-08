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
public class _1_binary_search{
    static int binarySearch(int[] data, int low, int high, int key) {
        int count = 0;
        if (high < low) {
            return -1;
        }

        int mid = (int) Math.floor(low + ((high - low) / 2));

        if (data[mid] == key) {

            return mid;
        } else if (key < data[mid]) {
            return binarySearch(data, low, mid - 1, key);
        } else {
            return binarySearch(data, mid + 1, high, key);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //        int key=in.nextInt();
        int datalength = in .nextInt();
        int data[] = new int[datalength];

        for (int i = 0; i < datalength; i++) {
            data[i] = in .nextInt();
        }
        int applentgh = in .nextInt();
        int app[] = new int[applentgh];

        for (int i = 0; i < applentgh; i++) {
            app[i] = in .nextInt();
        }

        for (int i = 0; i < applentgh; i++) {
            System.out.print(binarySearch(data, 0, datalength - 1, app[i]) + " ");
        }


    }
}