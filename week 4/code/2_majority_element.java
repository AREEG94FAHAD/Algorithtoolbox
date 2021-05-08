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
public class _2_majority_element {
    static int binarySearch(int[] data, int low, int high, int key) {

        //        int count=0;
        if (high < low) {
            return -1;
        }

        int mid = (int) Math.floor(low + ((high - low) / 2));

        if (data[mid] == key) {
            int count = 0; {
                for (int u = mid; u < data.length; u++) {
                    if (data[u] == key) {
                        count++;

                    } else {
                        break;
                    }
                }
                for (int u = mid - 1; u >= 0; u--) {
                    if (data[u] == key) {
                        count++;

                    } else {
                        break;
                    }
                }

            }

            return count;
        } else if (key < data[mid]) {
            return binarySearch(data, low, mid - 1, key);
        } else {
            return binarySearch(data, mid + 1, high, key);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int datalength = in .nextInt();
        int data[] = new int[datalength];

        for (int i = 0; i < datalength; i++) {
            data[i] = in .nextInt();
        }

        int app[] = data;
        Arrays.sort(data);
        Arrays.sort(app);



        for (int i = 0; i < datalength; i++) {
            if (i > 0 && app[i] == app[i - 1]) {
                continue;
            }
            double maj = binarySearch(data, 0, datalength - 1, app[i]);
            if (maj / data.length > 0.5) {
                System.out.print(1);
                System.exit(0);
            }
        }
        System.out.print(0);


    }
}