//Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
0 < s <= min(n, m) / 2
-10^9 <= r <= 10^9

//Sample Input
5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3

//Sample Output
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57
  
  
import java.io.*;
import java.util.*;

public class Main {

  public static int[] from2Dto1D(int[][] arr, int s)
  {
    int  n = arr.length;
    int  m = arr[0].length;

    int minr = s - 1;
    int maxr = n - s;
    int minc = s - 1;
    int maxc = m - s;

    int size = 2 * (maxr - minr + maxc - minc);
    int[] oneD = new int[size];
    int idx = 0;

    for (int i = minr; i <= maxr; i++)
    {
      oneD[idx] = arr[i][minc];
      idx++;
    }
    minc++;

    for (int i = minc; i <= maxc; i++)
    {
      oneD[idx] = arr[maxr][i];
      idx++;
    }
    maxr--;

    for (int i = maxr; i >= minr; i--)
    {
      oneD[idx] = arr[i][maxc];
      idx++;
    }
    maxc--;

    for (int i = maxc; i >= minc; i--)
    {
      oneD[idx] = arr[minr][i];
      idx++;
    }

    return oneD;

  }
  public static void reverse(int[] oneD, int n, int m)
  { int temp;
    while (n <= m)
    {
      temp = oneD[n];
      oneD[n] = oneD[m];
      oneD[m] = temp;

      n++;
      m--;
    }
  }
  public static void rotate(int[]oneD, int r)
  {
    r %= oneD.length;
    if (r < 0)
    {
      r += oneD.length;
    }
    int n = oneD.length;

    reverse(oneD, 0, n - r - 1);
    reverse(oneD, n - r, n - 1);
    reverse(oneD, 0, n - 1);
  }
  public static void from1Dto2D(int[] oneD, int[][] arr, int s)
  {
    int  n = arr.length;
    int  m = arr[0].length;

    int minr = s - 1;
    int maxr = n - s;
    int minc = s - 1;
    int maxc = m - s;

    int idx = 0;

    for (int i = minr; i <= maxr; i++)
    {
      arr[i][minc] = oneD[idx];
      idx++;
    }
    minc++;

    for (int i = minc; i <= maxc; i++)
    {
      arr[maxr][i] = oneD[idx];
      idx++;
    }
    maxr--;

    for (int i = maxr; i >= minr; i--)
    {
      arr[i][maxc] = oneD[idx];
      idx++;
    }
    maxc--;

    for (int i = maxc; i >= minc; i--)
    {
      arr[minr][i] = oneD[idx];
      idx++;
    }
  }
  public static void ringRotate(int[][] arr, int r, int s)
  {
    int[] oneD = from2Dto1D(arr, s);
    rotate(oneD, r);
    from1Dto2D(oneD, arr, s);
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }

    int s = sc.nextInt();
    int r = sc.nextInt();

    ringRotate(arr, r, s);
    display(arr);

  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
