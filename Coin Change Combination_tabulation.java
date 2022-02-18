Sample Input

4
2
3
5
6
7

Sample Output
2

import java.io.*;
import java.util.*;

public class Main {
    public static int coinChangCombination( int []arr , int amt)
    {
        int n =arr.length;
        int[] dp= new int[amt+1];
        dp[0]=1;

        for(int i=0;i<n;i++)
        {
            for(int j=1 ;j<dp.length;j++)
            {
                if(j-arr[i]>=0)
                {
                    dp[j]+=dp[j-arr[i]];
                }

            }
        }
        return dp[amt];
    }
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins= new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i]=sc.nextInt();
        }
        // Arrays.sort(coins , 0 , coins.length);
        // for(int i=0;i<n;i++)
        // {
        // System.out.println(coins[i]);
        // }
       
        int amt= sc.nextInt();

        int comb= coinChangCombination(coins , amt);
        System.out.println(comb);
        }
}
