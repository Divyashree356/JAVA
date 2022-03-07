import java.io.*;
import java.util.*;

public class Main {

    public static int paintHouseManyColors(int[][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        int[][] dp= new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0)
                {
                    dp[i][j]=arr[i][j];
                    continue;
                }
                int min = Integer.MAX_VALUE;
                for(int k=0;k<m;k++)
                {
                    if(k!=j)
                    {
                        if(min>dp[i-1][k])
                        {
                            min= dp[i-1][k];
                        }
                    }
                }

                dp[i][j]= arr[i][j]+min;
            }
        }
        int finalMin= Integer.MAX_VALUE;
        for(int j=0;j<m;j++)
        {
            if(dp[n-1][j]<finalMin)
            {
                finalMin= dp[n-1][j];
            }
        }
        return finalMin;
    }

    public static void main(String[] args) throws Exception {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int k= sc.nextInt();

            int[][] arr= new int[n][k];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<k;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }

            int ans= paintHouseManyColors(arr);
             System.out.println(ans);
            
        }
}
