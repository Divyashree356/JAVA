//Sample Input
wwwwaaadexxxxxx

//Sample Output
wadex
w4a3dex6

import java.io.*;
import java.util.*;

public class Main {

  public static String compression1(String str) {
    String ans = "" + str.charAt(0);
    for (int i = 1; i < str.length(); i++)
    {
      int prev = i - 1;
      if (str.charAt(i - 1) != str.charAt(i))
      {
        ans += str.charAt(i);
      }
    }

    return ans;
  }

  public static String compression2(String str) {
    int count = 1;
    String ans = "" + str.charAt(0);
    for (int i = 1; i < str.length(); i++)
    {
      if (str.charAt(i - 1) == str.charAt(i))
      {
        count++;
      }
      else {
        if (count > 1)
        {
          ans += count;
          count = 1;
        }
        ans += str.charAt(i);
      }
    }
    if (count > 1)
      ans += count;

    return ans;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }

}
