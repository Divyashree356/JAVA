import java.io.*;
import java.util.*;

public class Main {

  public static int firstIndex(int[] arr, int idx, int x) {

    if (idx == arr.length)
      return -1;

    if (arr[idx] == x)
    {
      return idx;
    }

    return firstIndex(arr, idx + 1, x);
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];

    for (int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();

    int fi = firstIndex(arr, 0, x);
    System.out.println(fi);
  }


}
