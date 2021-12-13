//Sample Input
2
3
10 0 0 0 20 0 

3
4
1 0 1 0 0 1  1 2  1 1 0 0


//Sample Output
10 0 10 0
0 20 20 40

import java.io.*;
import java.util.*;

public class Main {
  public static int[][] matrixMul(int[][] A, int[][] B)
  {
    int r1 = A.length;
    int c1 = A[0].length;
    int r2 = B.length;
    int c2 = B[0].length;

    int[][] mul = new int[A.length][B[0].length];
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
        int sum = 0;
        for (int k = 0; k < c1; k++) {
          sum += A[i][k] * B[k][j];
        }
        mul[i][j] = sum;
      }
    }
return mul;

  }
  public static void display(int[][] A)
  {
    for (int i = 0; i < A.length; i++)
    {
      for (int j = 0; j < A[0].length; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int r1 = scn.nextInt();
    int c1 = scn.nextInt();
    int[][] arr1 = new int[r1][c1];

    for (int i = 0; i < r1; i++)
    {
      for (int j = 0; j < c1; j++)
      {
        arr1[i][j] = scn.nextInt();
      }
    }
    int r2 = scn.nextInt();
    int c2 = scn.nextInt();
    int[][] arr2 = new int[r2][c2];

    for (int i = 0; i < r2; i++)
    {
      for (int j = 0; j < c2; j++)
      {
        arr2[i][j] = scn.nextInt();
      }
    }
    if (c1 == r2)
    {
      int[][] C =new int[r1][c2];
      C=matrixMul(arr1, arr2);
      display(C);
    }
    else {
      System.out.println("Invalid input");
    }
  }

}
