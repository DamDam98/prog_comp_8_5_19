/*

// Problem: https://open.kattis.com/contests/naq19open/problems/circuitmath

import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    HashMap<Character, Boolean> bools = new HashMap<>();

    // build map for char - boolean pairs
    for (int i = 0; i < n; i++)
    {
      if (in.next().charAt(0) == 'T')
        bools.put((char)((int)'A' + i) , true);
      else
        bools.put((char)((int)'A' + i) , false);
    }

    Stack<Boolean> s = new Stack<>();

    while(in.hasNext())
    {
      char c = in.next().charAt(0);
      if (Character.isAlphabetic(c))
      {
        s.push(bools.get(c));
      }
      else
      {
        if (c == '*')
        {
          boolean a = s.pop();
          boolean b = s.pop();
          s.push(a && b);
        }

        if (c == '+')
        {
          boolean a = s.pop();
          boolean b = s.pop();
          s.push(a || b);
        }

        if (c == '-')
        {
          boolean a = s.pop();
          s.push((!a));
        }

      }
      if (c == '!')
        break;
    }
    if (s.pop)
      System.out.println("T");
    else
      System.out.println("F");
    in.close();
  }
}

*/
