Sample Input

5
4
2
7
1
3
10

Sample Output
true

import java.io.*;
import java.util.*;

public class Main {
    public static boolean sumSubset(int[] arr , boolean[][] dp)
    {
        int n=dp.length;
        int m=dp[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0)
                 dp[i][j]=true;

                else if(i==0)
                 dp[i][j]=false;

                else
                {
                 boolean noCall= dp[i-1][j];
                 boolean yesCall =false;

                 if(j-arr[i-1]>=0)
                   yesCall=dp[i-1][j-arr[i-1]];  

                dp[i][j]= noCall|| yesCall;
                
                }
            }
             
        }
        return dp[n-1][m-1];
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        boolean[][] dp= new  boolean[n+1][target+1];

        boolean ans= sumSubset(arr , dp);
        System.out.println(ans);
    }
}
