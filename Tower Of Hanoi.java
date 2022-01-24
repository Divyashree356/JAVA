Sample Input
3
10
11
12

Sample Output
1[10 -> 11]
2[10 -> 12]
1[11 -> 12]
3[10 -> 11]
1[12 -> 10]
2[12 -> 11]
1[10 -> 11]

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();

    toh(n, n1, n2, n3);
  }

  public static void toh(int n, int A, int B, int C) {
    if (n == 0)
      return ;

    toh(n - 1, A, C, B);
    System.out.println(n + "[" + A + " -> " + B + "]");
    toh(n - 1, C, B, A);
  }

}
