Sample Input
5
10
20
30
40
50
60
Sample Output
10, 20, 30, .
10, 50, .
20, 40, .


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        printTargetSumSubsets(arr, 0 ,"" , 0,target);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
  public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar) {
        if(arr.length==idx)
        {
            if(sum==tar)
                {
                  System.out.println(asf+".");  
                }
                return;
        }
printTargetSumSubsets(arr, idx+1, asf+arr[idx]+", ", sum+arr[idx],tar);
printTargetSumSubsets(arr, idx+1, asf , sum,tar);
            
        
    }

}
