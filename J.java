/*


// Problem: https://open.kattis.com/contests/naq19open/problems/stopcounting

import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] nums = new int[(n + 1)];
    for (int i = 1; i <= n; i++)
    {
      nums[i] = in.nextInt();
    }

    double[] left = new double[n + 1];
    double[] right = new double[n + 1];

    double cur = 0;
    double max = 0;

    // dp from left to right
    for (int i = 1; i <= n; i++)
    {
      cur += nums[i];
      if (cur / i > max)
        max = cur / i;
      left[i] = max;
    }

    cur = 0;
    max = 0;
    // dp from right to left
    for (int i = n; i > 0; i--)
    {
      cur += nums[i];
      if (cur / i > max)
        max = cur / (n - i + 1);
      left[i] = max;
    }

    max = 0;
    for (int i = 1; i <= n; i++)
    {
      double div_sum = left[i] + right[i];
      if (div_sum > max)
        max = div_sum;
    }

    System.out.printf("%.10f", max);
  }
}
*/
