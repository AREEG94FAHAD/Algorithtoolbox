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
public class refuling {

  static int computeMinRefills(int dist, int m, int tank, int[] stops) {
    int numrefuling = 0;
    int pointer = m;

    if (stops[0] > pointer) {
      return - 1;
    }
    if (dist <= m) {
      return 0;
    }

    for (int i = 0; i < stops.length; i++) {

      if (stops[i] > pointer) {
        if ((stops[i] - stops[i - 1]) > m) {
          return - 1;
        }
        pointer = stops[i - 1] + m;
        numrefuling++;

      }

      if (stops[i] == pointer && stops[i] != dist) {

        pointer = stops[i] + m;

        numrefuling++;

      }
    }

    if (stops[stops.length - 1] + m >= dist) {
      return numrefuling;
    }

    return - 1;

  }

  public static void main(String[] args) {
    Scanner in =new Scanner(System. in );

    int dist = in.nextInt();
    int m = in.nextInt();
    int tank = in.nextInt();
    int x = 0;

    int[] stops = new int[tank + 1];

    for (int i = 0; i < tank; i++) {
      stops[i] = in.nextInt();

    }
    stops[tank] = dist;

    System.out.println(computeMinRefills(dist, m, tank, stops));

  }

}