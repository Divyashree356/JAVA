Sample Input
4
Sample Output
0-1, 1-3, 2-0, 3-2, .
0-2, 1-0, 2-3, 3-1, .

import java.io.*;
import java.util.*;

public class Main {
  public static boolean isSafe(int r, int c, int[][] chess)
  {
    int n = chess.length;
    for (int i = r - 1, j = c - 1 ; i >= 0 && j >= 0 ; i--, j--)
    {
      if (chess[i][j] == 1)
        return false;
    }
    for (int i = r - 1, j = c ; i >= 0 ; i--)
    {
      if (chess[i][j] == 1)
        return false;
    }
    for (int i = r - 1, j = c + 1 ; i >= 0 && j < n ; i--, j++)
    {
      if (chess[i][j] == 1)
        return false;
    }
    return true;
  }
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [][] chess = new int[n][n];
    printNQueens(chess, "", 0);
  }

  public static void printNQueens(int[][] chess, String asf, int row) {
    if (row == chess.length)
    {
      System.out.println(asf + ".");
    }

    for (int col = 0; col < chess.length; col++)
    {
      if (isSafe(row, col, chess))
      {
        chess[row][col] = 1;
        printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
        chess[row][col] = 0;
      }

    }
  }
}
