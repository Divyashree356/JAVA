Sample Input

10

Sample Output
55

import java.io.*;
import java.util.*;

public class Main{
public static int fiboM(int n , int[] dp)
{
    if(n<=1)
     return dp[n]=n;

    if(dp[n]!=-1)
     return dp[n];

    int nm1=fiboM(n-1, dp);
    int nm2= fiboM(n-2,dp);

    return dp[n]=nm1+nm2;
}
public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();

    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);

    int ans= fiboM(n ,dp);
    System.out.println(ans);
 }

}
