//Sample Input
3
10 20 30

//Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	

import java.io.*;
import java.util.*;

public class Main {
  public static void subSet(int[] a, int n)
  {
    int total = (int)Math.pow(2, n);
    for (int i = 0; i < total; i++)
    { String s = "";
      int temp = i;
      for (int j = n - 1; j >= 0; j--)
      {
        int r = temp % 2;
        temp = temp / 2;
        if (r == 0)
        {
          s = "-\t" + s;
        }
        else {
          s = a[j] + "\t" + s;
        }
      }
      System.out.println(s);
    }

  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
    {
      arr[i] = scn.nextInt();
    }
    subSet(arr, n);
  }

}
