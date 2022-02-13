Sample Input

4

Sample Output
7

import java.io.*;
import java.util.*;

public class Main {

    // public static void displayDp(int[] dp)  //to display our dp-we can see values are filing left to right so we make the loop in tabulation left to right
    // {
    //     for(int el:dp)
    //         System.out.print(el+" ");
    //     System.out.println();

    // }
    // public static int climbStairsR(int n)  //simple recursion method
    //     {
    //         if(n==0)
    //          return 1;

    //         int count=0;
    //         if(n-1>=0)
    //         {
    //             count+=climbStairs(n-1);
    //         }
    //         if(n-2>=0)
    //         {
    //             count+=climbStairs(n-2);
    //         }
    //         if(n-3>=0)
    //         {
    //             count+=climbStairs(n-3);
    //         }

    //         return count;
    //     }
    // 
    public static int climbStairsT(int N, int[]dp)  //Tabulation method
        {
            for(int n=0;n<dp.length;n++)
            {
              if(n==0)
             {
                dp[n]= 1;
                continue;
             }
            // if(dp[n]!=-1)
            //   return dp[n];

            int count=0;
            if(n-1>=0)
            {
                count+=  dp[n-1];   //climbStairsM(n-1,dp);
            }
            if(n-2>=0)
            {
                count+=dp[n-2];  //climbStairsM(n-2,dp);
            }
            if(n-3>=0)
            {
                count+=dp[n-3];  //climbStairsM(n-3,dp);
            }

             dp[n]=count;
            }
            return dp[N];
        }
    

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[] dp= new int[n+1];
        Arrays.fill(dp ,-1);
        int ans= climbStairsT(n,dp);
        // displayDp(dp);
        System.out.println(ans);
    }

}
