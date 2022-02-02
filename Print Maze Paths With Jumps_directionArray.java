import java.io.*;
import java.util.*;

public class Main {
  static int[][] dir = {{0, 1}, {1, 0}, {1, 1}};
  static String [] dirName = {"h", "v", "d"};
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    printMazePaths(0, 0, n - 1, m - 1, "");
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
    if (sr == dr && sc == dc)
    {
      System.out.println(psf);
      return;
    }

    for (int d = 0; d < dir.length ; d++)
    {
      for (int jump = 1; jump <= Math.max(dr, dc) + 1; jump++)
      {
        int r = sr + (jump * dir[d][0]);
        int c = sc + (jump * dir[d][1]);

        if (r >= 0 && r <= dr && c >= 0 && c <= dc)
        {
          printMazePaths(r, c, dr, dc, psf + dirName[d] + jump);
        }
      }
    }

  }

}
