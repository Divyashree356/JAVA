Sample Input

10

Sample Output
55


//MEMOIZATION
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


//TABULATION

import java.io.*;
import java.util.*;

public class Main{
public static int fiboT(int N , int[] dp)
{
   for(int n=0;n<dp.length;n++)
   {
     if(n<=1)
      {
          dp[n]=n;
            continue;
      }

    int nm1= dp[n-1];   //fiboM(n-1, dp);
    int nm2= dp[n-2];          //fiboM(n-2,dp);

    dp[n]=nm1+nm2;
   }
   return dp[N];
}
public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();

    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);

    int ans= fiboT(n ,dp);
    System.out.println(ans);
 }

}
