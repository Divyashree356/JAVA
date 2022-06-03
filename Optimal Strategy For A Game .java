// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class OptimalStrategy
{
    public static void main (String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //inserting the elements
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
           //calling the countMaximum() method of class solve
           System.out.println(new solve().countMaximum(arr, n)); 
        }
    }
    
    
}// } Driver Code Ends



class solve
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int arr[], int n)
    {
        int total=0;
        
        for(int i : arr)
         total+=i;
           
        int[][] dp= new int[n+1][n+1];
        
        for(int i=0;i<n+1;i++)
         Arrays.fill(dp[i] , -1);
         
        int maxScore= solver(arr , 0 , n-1,0 , dp);
        
        total-=maxScore;
        

         return maxScore;
         
    }
    
    static int solver(int[]arr , int i , int j , int ch , int[][]dp)
    {
        if(i>j)
         return 0;
         
        if(dp[i][j]!=-1)
         return dp[i][j];
         
        if(ch==0)
        {
            return dp[i][j]= Math.max(arr[i]+ solver(arr, i+1 , j, 1,dp),
                   arr[j]+ solver(arr , i, j-1, 1,dp));
        }
        
        else
         return dp[i][j]=Math.min(solver(arr, i+1 , j, 0,dp) , solver(arr, i, j-1 , 0,dp));
        
    }
}
