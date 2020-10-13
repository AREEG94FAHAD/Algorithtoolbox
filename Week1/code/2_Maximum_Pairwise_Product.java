import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io. * ;
import java.util.Arrays;

public class MaxPairwiseProductt {
  static Long getTheMaximumPairwise(long[] numbers) {
    Long result = Long.valueOf(0);
    int n = numbers.length;
    Arrays.sort(numbers);
    return (numbers[n - 1]) * (numbers[n - 2]);
  }
  public static void main(String[] args) {
    FastScanner scanner = new FastScanner(System. in );
    int n = scanner.nextInt();
    long[] numbers = new long[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }
    System.out.println(getTheMaximumPairwise(numbers));
  }
  static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
      try {
        br = new BufferedReader(new InputStreamReader(stream));
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    String next() {
      while (st == null || !st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch(IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
  }

}