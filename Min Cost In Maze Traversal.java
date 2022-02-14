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
23

import java.io.*;
import java.util.*;

public class Main {
//Tabulation method
    public static void main(String[] args) throws Exception {
                Scanner sc= new Scanner(System.in);
                int n=sc.nextInt();
                int m= sc.nextInt();

                int[][] arr= new int[n][m];

                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        arr[i][j]=sc.nextInt();
                    }
                }

                int[][] dp=new int[n][m];

                for(int i=n-1;i>=0;i--)
                {
                    for(int j=m-1;j>=0;j--)
                    {
                       if(i==n-1 && j==m-1)
                       {
                           dp[i][j]=arr[i][j];
                       } 

                       else if(i==n-1)
                       {
                           dp[i][j]=dp[i][j+1]+arr[i][j];
                       }
                       else if(j==m-1)
                       {
                           dp[i][j]=dp[i+1][j]+arr[i][j];
                       }
                       else
                       {
                           int min =Math.min(dp[i+1][j],  dp[i][j+1]);
                           dp[i][j]= min+arr[i][j];
                       }
                    }
                }

                     System.out.println(dp[0][0]);
                //  for(int i=0;i<n;i++)
                // {
                //     for(int j=0;j<m;j++)
                //     {
                //        System.out.print(dp[i][j]+" ");
                //     }
                //     System.out.println();
                // }

            
    }

}
