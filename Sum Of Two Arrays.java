//Sample Input
5
3 1 0 7 5
6
1 1 1 1 1 1
 
//Sample Output
1 4 2 1 8 6



import java.io.*;
import java.util.*;

public class Main {

  public static void sumOfArray(int[] a, int[] b)
  {
    int n1 = a.length;
    int n2 = b.length;
    int i = n1 - 1;
    int j = n2 - 1;
    int size = (n1 > n2) ? n1 : n2;
    int[] ans = new int[size];
    int carry = 0 ;
    int k = ans.length - 1;
    while (k >= 0)
    {
      int sum = 0;
      sum += carry;
      if (i >= 0) {
        sum += a[i];
      }
      if (j >= 0)
      {
        sum += b[j];
      }
      ans[k] = sum % 10;
      carry = sum / 10;

      i--;
      k--;
      j--;

    }
    if (carry != 0)
    {
      System.out.println(carry);
    }

    for (int ele : ans)
    {
      System.out.println(ele);
    }

  }
  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] a = new int[n1];
    for (int i = 0; i < n1; i++) {
      a[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[] b = new int[n2];
    for (int i = 0; i < n2; i++) {
      b[i] = scn.nextInt();
    }
    sumOfArray(a, b);
  }

}
