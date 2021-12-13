
//Sample Input
3
2 6 7
4
1 0 0 0 

//n2>n1

//Sample Output
7 3 3

import java.io.*;
import java.util.*;

public class Main {

  public static int[] diffrence(int[] a, int[] b)
  {
    int[] ans = new int[b.length];
    int i = a.length - 1;
    int j = b.length - 1;
    int k = ans.length - 1;
    int borrow = 0;
    while (k >= 0)
    {
      int digit = 0;
      digit = b[j] + borrow;
      if (i >= 0) {
        digit -= a[i];
      }
      if (digit < 0)
      {
        digit += 10;
        borrow = -1;
      }
      else {
        borrow = 0;
      }
      ans[k] = digit;
      k--;
      j--;
      i--;
    }
    return ans;
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] A = new int[n1];
    for (int i = 0; i < n1; i++)
    {
      A[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[] B = new int[n2];
    for (int i = 0; i < n2; i++)
    {
      B[i] = scn.nextInt();
    }

    int[] ans = diffrence(A, B);
  //first non zero index
  //if no non zero number found to check if we assign it as -1
    int fnzi = -1;
    for (int i = 0; i < ans.length; i++)
    { if (ans[i] != 0)
      { fnzi = i;
        break;
      }
    } 
    if (fnzi == -1) {
      System.out.println(0);
      return;
    }
    for (int i = fnzi; i < ans.length; i++)
    {
      System.out.println(ans[i]);
    }
  }

}
