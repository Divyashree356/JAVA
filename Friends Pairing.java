import java.io.*;
import java.util.*;

public class Main {
    //Memoization
   public static int pairing(int n, int[]dp)
      {        
          if(n<=2)
          {
              return dp[n]=n;
          }
          if(dp[n]!=0)
          return dp[n];

          int single= pairing(n-1 , dp);
          int pair= pairing(n-2 , dp);

          return dp[n]= single +(n-1)*pair;
         
        }
         public static int pairingTab(int N, int[]dp)
      {        
         for(int n=0;n<=N;n++)
         {
             if(n<=2)
          {
              dp[n]=n;
              continue;
          }

          int single= dp[n-1];
          int pair= dp[n-2];

          dp[n]= single + (n-1)*pair;
         
         }
         return dp[N];
        }
    public static void main(String[] args) throws Exception {
              Scanner sc= new Scanner(System.in);
              int n=sc.nextInt();

              
              
              int[] dp= new int[n+1];
             int ans= pairingTab(n , dp);
              System.out.println(ans);
    }

}
