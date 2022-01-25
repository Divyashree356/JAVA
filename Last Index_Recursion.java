Sample Input
6
15
11
40
4
4
9
4
Sample Output
4

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];

    for (int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();

    int li = lastIndex(arr, 0, x);
    System.out.println(li);
  }

  public static int lastIndex(int[] arr, int idx, int x) {
    if (idx == arr.length)
      return -1;

    int li = lastIndex(arr, idx + 1, x);

    if (li == -1)
    {
      if (arr[idx] == x)
        return idx;

      else
        return li;
    }
    else
      return li;
  }

}
