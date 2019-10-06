/*

// Problem: https://open.kattis.com/contests/naq19open/problems/gerrymandering

import java.util.*;

class Main {




  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int p = in.nextInt(); // precinct (not important)
    int d = in.nextInt(); // district (super important)

    int [] votes = new int[2 * (d + 1)];

    // read in vote info
    for (int i = 0; i < p; i++)
    {
      int currD = in.nextInt();
      int i_a = currD * 2;
      int i_b = currD * 2 + 1;
      votes[i_a] += in.nextInt();
      votes[i_b] += in.nextInt();
    }

    int v = 0;
    for (int vote : votes)
    {
      v += vote;
    }

    int w_a = 0;
    int w_b = 0;



    for (int i = 1; i <= d; i++)
    {
      int a_votes = votes[(i * 2)];
      int b_votes = votes[(i * 2) + 1];
      int center = ((a_votes + b_votes) / 2) + 1;
      int curr_w_a = 0;
      int curr_w_b = 0;

      // if a wins
      if (a_votes > b_votes)
      {
        curr_w_b += b_votes;
        curr_w_a += a_votes - center;
        System.out.println("A " + curr_w_a + " " + curr_w_b);
      }

      // if b wins
      else
      {
        curr_w_a += a_votes;
        curr_w_b += b_votes - center;
        System.out.println("B " + curr_w_a + " " + curr_w_b);

      }

      w_a += curr_w_a;
      w_b += curr_w_b;

    }
    // total wasted
    double w = w_a - w_b;

    if (w < 1)
      w *= -1;

    double eff = w / v;


    System.out.printf("%.10f", eff);
  }
}
*/
