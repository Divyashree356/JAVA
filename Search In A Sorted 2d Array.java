//Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
All rows and columns are sorted in increasing order

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
43

//Sample Output
3
2

import java.io.*;
import java.util.*;

public class Main {
  public static void search2D(int[][] arr, int x)
  {
    int n = arr.length;
    int i = 0;
    int j = n - 1;
    while (i < n && j >= 0)
    {
      if (arr[i][j] < x)
      {
        i++;
      }
      else
      {
        if (arr[i][j] == x)
        {
          System.out.println(i);
          System.out.println(j);
          return;
        }
        else
        {
          j--;
        }
      }

    }
    System.out.println("Not Found");

  }
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    int x = sc.nextInt();
    search2D(arr, x);
  }

}
