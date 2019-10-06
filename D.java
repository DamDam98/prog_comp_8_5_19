/*


// problem: https://open.kattis.com/contests/naq19open/problems/missingnumbers


import java.util.*;

class Main {
  public static Queue<Integer> missingNumbers(int[] nums){
    Queue<Integer> q = new LinkedList<>();

    // grab the final number
    int prev = 1;
    int curr = 0;

    for (int i = 0; i < nums.length; i++)
    {
      curr = nums[i];
      while (prev < curr)
      {
        q.add(prev);
        prev++;
        }
      prev = curr + 1;
    }

    return q;
  }



  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++)
      arr[i] = in.nextInt();
    Queue<Integer> q = missingNumbers(arr);
    if (q.isEmpty())
      System.out.println("good job");

    while(!q.isEmpty())
      System.out.println(q.remove());
  }
}
