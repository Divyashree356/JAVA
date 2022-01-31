Sample Input
3
3
Sample Output
[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]

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
    if (sc + 1 <= dc)
    {
      ArrayList<String> hval =  getMazePaths(sr, sc + 1, dr, dc);
      for (String ele : hval)
      {
        myAns.add("h" + ele);
      }
    }
    if (sr + 1 <= dr)
    {
      ArrayList<String> vval =  getMazePaths(sr + 1, sc, dr, dc);
      for (String ele : vval)
      {
        myAns.add("v" + ele);
      }

    }
    return myAns;
  }

}
