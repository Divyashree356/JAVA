Sample Input
2
2
Sample Output
[h1v1, v1h1, d1]

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1);
    System.out.println(ans);
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    if (sr == dr && sc == dc)
    {
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }

    ArrayList<String> myAns = new ArrayList<>();

    for (int jump = 1; sc + jump <= dc; jump++)
    {
      ArrayList<String> hCall = getMazePaths(sr, sc + jump, dr, dc);
      for (String ele : hCall)
      {
        myAns.add("h" + jump + ele);
      }
    }
    for (int jump = 1; sr + jump <= dr; jump++)
    {
      ArrayList<String> vCall = getMazePaths(sr + jump, sc, dr, dc);
      for (String ele : vCall)
      {
        myAns.add("v" + jump + ele);
      }
    }
    for (int jump = 1; sc + jump <= dc && sr + jump <= dr; jump++)
    {
      ArrayList<String> dCall = getMazePaths(sr + jump, sc + jump, dr, dc);
      for (String ele : dCall)
      {
        myAns.add("d" + jump + ele);
      }
    }
    return myAns;
  }

}
