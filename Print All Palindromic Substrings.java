//Sample Input
abcc

//Sample Output
a
b
c
cc
c

import java.io.*;
import java.util.*;

public class Main {
  public static boolean isPal(String s)
  {
    int i = 0;
    int j = s.length() - 1;
    while (i <= j)
    {
      int ch1 = s.charAt(i);
      int ch2 = s.charAt(j);
      if (ch1 != ch2)
      {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
  public static void solution(String str)
  {
    int n = str.length();
    for (int st = 0; st < n; st++)
    {
      for (int end = st; end < n; end++)
      {
        String subs = str.substring(st, end + 1);
        if (isPal(subs) == true)
        {
          System.out.println(subs);
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }

}
