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
4

import java.io.*;
import java.util.*;

public class Main {
//Tabulation method
//dp traversed from right to left

    public static void main(String[] args) throws Exception {
        Scanner sc=  new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
        {
                arr[i]=sc.nextInt();
        }
        int[] dp= new int[n+1];
        Arrays.fill(dp , -1);
         dp[n]=0;

        for(int i=n-1;i>=0;i--)
        {
          if(arr[i]>0)
          {
              int min= Integer.MAX_VALUE;

              for(int jump=1;jump<=arr[i] && i+jump<dp.length;jump++)
              { 
                  if(dp[i+jump]!=-1)
                  min= Math.min(min , dp[i+jump]);
              }

             if(min!=Integer.MAX_VALUE)
               dp[i]=min+1 ;
          }
        }
        System.out.println(dp[0]);


    }

}
