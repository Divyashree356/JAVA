//Sample Input
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35

//Sample Output
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24


import java.io.*;
import java.util.*;

public class Main {
  public static void spiral(int[][] arr)
  {
    int n = arr.length;
    int m = arr[0].length;

    int minr = 0;
    int minc = 0;
    int maxr = n - 1;
    int maxc = m - 1;

    int count = 0;
    int total = n * m;

    while (count < total)
    {
      for (int i = minr; i <= maxr && count < total; i++)
      {
        System.out.println(arr[i][minc]);
        count++;
      }
      minc++;
      for (int i = minc; i <= maxc && count < total; i++)
      {
        System.out.println(arr[maxr][i]);
        count++;
      }
      maxr--;
      for (int i = maxr; i >= minr && count < total; i--)
      {
        System.out.println(arr[i][maxc]);
        count++;
      }
      maxc--;
      for (int i = maxc; i >= minc && count < total ; i--)
      {
        System.out.println(arr[minr][i]);
        count++;
      }
      minr++;
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] a = new int[n][m];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        a[i][j] = scn.nextInt();
      }
    }
    spiral(a);
  }

}
