//Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

  //Sample Output
11
22
33
44
12
23
34
  
  
import java.io.*;
import java.util.*;

public class Main {
  public static void gapStrategy(int[][] arr)
  {
    for (int gap = 0; gap < arr.length; gap++)
    {
      for (int i = 0, j = gap; j < arr.length; i++, j++)
      {
        System.out.println(arr[i][j]);
      }
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    gapStrategy(arr);
  }

}
