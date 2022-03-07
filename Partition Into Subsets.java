import java.io.*;
import java.util.*;

public class Main {
        
    public static long partitionKSubset(int numbers, int sets) {
        if(numbers==0 || sets==0 || sets>numbers)
          return 0;

        long[][] dp= new long[sets+1][numbers+1];

        for(int s=1;s<=sets;s++)
        {
            for(int n=1;n<=numbers;n++)
            {
                if(s>n)
                {
                    dp[s][n]=0;
                }
                else if(s==n)
                dp[s][n]=1;

                else 
                {
                    dp[s][n] = dp[s-1][n-1] + dp[s][n-1]*s;
                }
            }
        }
        return dp[sets][numbers];

    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}
