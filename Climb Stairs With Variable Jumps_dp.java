Sample Input

10
3
3
0
2
1
2
4
2
0
0

Sample Output
5

import java.io.*;
import java.util.*;

public class Main {
    // public static int solveM(int[]arr , int src ,int dest,int[]dp )  //memoization
    // {
    //     if(src==dest)
    //      return dp[src]=1;

    //     if(dp[src]!=-1)
    //       return dp[src];

    //     int count=0;

    //     for(int jump=1;jump<=arr[src] && jump+src<=dest;jump++)
    //     {
    //         count+=solveR(arr, src+jump , dest ,dp);
    //     }
    //     return dp[src]=count;
    // }

     public static int solveT(int[]arr , int SRC,int dest,int[]dp )  //tabulation
    {
        for(int src=dp.length-1;src>=SRC;src--)
        {
            if(src==dest)
            {
                dp[src]=1;
                continue;
            }

            int count=0;
            for(int jump=1;jump<=arr[src] && jump+src<=dest ;jump++)
            {
              count+=dp[src+jump];
            }
            dp[src]=count;
        }
        return dp[SRC];
    }

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        int ans=solveT(arr, 0,n,dp);
        System.out.println(ans);

     }

}
