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
41

import java.io.*;
import java.util.*;

public class Main {
  public static void saddlePrice(int[][] arr)
  {
    int n = arr.length;
    for (int i = 0; i < n; i++)
    {
      int svc = 0;
      for (int j = 1; j < n; j++)
      {

        if (arr[i][j] < arr[i][svc])
        {
          svc = j;
        }
      }
      boolean flag = true;
      for (int k = 0; k < n; k++)
      {
        if (arr[k][svc] > arr[i][svc])
        {
          flag = false;
          break;
        }
      }
      if (flag == true)
      {
        System.out.println(arr[i][svc]);
        return;
      }
    }
    System.out.println("Invalid input");
  }
  public static void main(String[] args) throws Exception
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    for (int i = 0; i <n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
 saddlePrice(arr);
}

}
