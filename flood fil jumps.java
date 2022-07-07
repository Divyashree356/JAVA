
import java.util.*;
// package Flood Fill Variations;

public class jumps {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        boolean[][] arr = new boolean[n][m];
       int ans=floodFill(arr, 0, 0,n-1, m-1, "");
       System.out.println(ans);
    }
      
      static int[][] dir={{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
     static String[] dirN={"tl","t","tr","l","dr","d","dl","l"};

      private static boolean inRange(int r, int c, int dr, int dc)
      {
        if(r<0 || r>dr || c<0 || c>dc)
        {
                return false;
        }
        return true;
      }

      private static int floodFill(boolean[][] arr ,int sr , int sc, int dr , int dc ,String asf)
      {
     if(sr==dr && dc==sc)
        {
            System.out.println(asf);
            return 1;
        }
        arr[sr][sc]=true;
        int count=0;

        for(int d=0;d<dir.length;d++)
        {
          for(int j=1;j<=Math.max(dr, dc);j++)
          {
            int r= sr+dir[d][0]*j;
            int c= sc+dir[d][1]*j;

            if(inRange(r,c, dr, dc ) && !arr[r][c])
            {
                count+=floodFill(arr, r, c, dr, dc, asf+ dirN[d]+j);
            }
        }
    }
        arr[sr][sc]=false;
            return count;
      }
    
}
