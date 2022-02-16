Sample Input

6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1

Sample Output
33

import java.io.*;
import java.util.*;

public class Main {
  //Recursive code will give wrong answer-TLE
  //Memoization
    // public static int goldMine(int i , int j , int[][] grid , int[][] dp)
    // {
    //     if(i<0 || i>=grid.length || j<0 || j>=grid[0].length)
    //       return 0;

    //     if(dp[i][j]!=0)
    //      return dp[i][j];

    //     int op1 = goldMine(i-1 , j+1 ,grid , dp );
    //     int op2 = goldMine( i , j+1 ,grid , dp );
    //     int op3 = goldMine(i+1 , j+1 ,grid , dp );

    //     int max = Math.max(op1 , Math.max(op2 , op3));
        
    //     dp[i][j]=max+grid[i][j];

    //     return dp[i][j];

    // }


    //Tabulation
    public static int goldMineT(int[][] grid , int[][] dp)
    {
        int n=grid.length;
        int m =grid[0].length;
        
        for(int j=m-1 ; j>=0 ;j--)
        {
            for(int i=0;i<n;i++)
            {
                if(j==m-1)
                 dp[i][j]=grid[i][j];

                else if(i==0)
                 {
                     int op1= dp[i][j+1];
                     int op2= dp[i+1][j+1];

                     dp[i][j]= grid[i][j]+ Math.max(op1 , op2);
                 }

                else if(i==n-1)
                 {
                     int op1= dp[i][j+1];
                     int op2= dp[i-1][j+1];

                     dp[i][j]= grid[i][j]+ Math.max(op1 , op2);
                 }
                 
                else{
                    int op1= dp[i-1][j+1];
                    int op2= dp[i][j+1];
                    int op3= dp[i+1][j+1];

                dp[i][j]= grid[i][j]+ Math.max(op1 , Math.max(op2 , op3));

                }
            }
        
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
              if(ans<dp[i][0])
                 ans=dp[i][0];  
        }
        return ans;


    }


    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int ans=0;
        int[][] grid= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                grid[i][j]=sc.nextInt();
            }
        }

        int[][] dp= new int[n][m];
        // Arrays.fill(dp ,-1);
        //Memoization calling
        // for(int i=0;i<n;i++)
        // {
        //     int temp=goldMine(i , 0 , grid , dp);
        //      if(temp>ans)
        //        ans=temp;
        // }
        ans= goldMineT(grid , dp);
        System.out.println(ans);

    }

}
