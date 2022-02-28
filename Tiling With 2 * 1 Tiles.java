import java.io.*;
import java.util.*;

public class Main {

    //Tabulation
    public static int waysOfTilesTB(int  N, int[] dp)
    {
        for(int i=0;i<=N;i++)
        {
         if(i<=2)
        {
           dp[i]=i;
           continue;
        }
        
        dp[i]= dp[i-1] + dp[i-2];   
        }
        return dp[N];
    }
    //Recursion
    public static int waysOfTiles(int n , int[] dp)
    {
        if(n<=2)
        {
            return dp[n]=n;
        }

        if(dp[n]!=0)
        return dp[n];

        return dp[n]= waysOfTiles(n-1 , dp)  +  waysOfTiles(n-2 , dp);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] dp= new int[n+1];
        int ans = waysOfTilesTB(n , dp);
        System.out.println(ans);
    }
}
