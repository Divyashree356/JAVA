//Sample Input
3
10 20 30

//Sample Output
10	
10	20	
10	20	30	
20	
20	30	
30	


import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
    {
      arr[i] = scn.nextInt();
    }
    for (int start = 0; start < n; start++)
    {
      for (int end = start; end < n; end++)
      {
        for (int k = start; k <= end; k++)
        {
          System.out.print(arr[k] + "\t");
        }
        System.out.println();
      }
    }

  }

}
