Sample Input

5
15 14 10 45 30
2 5 1 3 4
7

Sample Output
75

import java.io.*;
import java.util.*;

public class Main {
    public static int knapsack(int[] val , int[] wt , int cap)
    {
        int[][] dp= new int[wt.length+1][cap+1];
        
        int n=dp.length;
        int m=dp[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0)
                 dp[i][j]=0;

                else if(i==0)
                 dp[i][j]=0;

                else
                {
                 int  noCall= dp[i-1][j];
                 int yesCall =-1;

                 if(j-wt[i-1]>=0)
                   yesCall=dp[i-1][j-wt[i-1]] + val[i-1];  

                dp[i][j]= Math.max(yesCall , noCall);
                
                }
            }
             
        }
        return dp[n-1][m-1];
    }
    

    public static void main(String[] args) throws Exception {
            Scanner sc=  new Scanner(System.in);
            
            int n= sc.nextInt();
            // int m = sc.nextInt();

            int[] val = new int[n];
            for(int i=0;i<n;i++)
            {
                val[i]= sc.nextInt();
            }
            int[] wt= new int[n];
            for(int i=0;i<n;i++)
            {
                wt[i]= sc.nextInt();
            }
            int capacity = sc.nextInt();
        
            int profit = knapsack(val , wt , capacity);
            System.out.println(profit);
                   
     }
}
