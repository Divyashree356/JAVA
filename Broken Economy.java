//Sample Input
10
1 5 10 12 22 33 40 42 55 66 
34

//Sample Output
40
33


import java.io.*;
import java.util.*;

public class Main {
  public static void binarySearch(int[] arr, int val)
  {
    int beg = 0;
    int end = arr.length - 1;

    while (beg <= end)
    {
      int mid = (beg + end) / 2;
      if (arr[mid] == val)
      {
        System.out.println(arr[mid]);
        break;

      }
      else if (arr[mid] > val)
      {
        end = mid - 1;
      }
      else {
        beg = mid + 1;
      }
    }
    System.out.println(arr[beg]);
    System.out.println(arr[end]);

  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++)
    {
      arr[i] = scn.nextInt();
    }
    int val = scn.nextInt();
    binarySearch(arr, val);
  }

}
