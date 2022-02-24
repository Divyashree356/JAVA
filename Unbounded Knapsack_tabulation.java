Sample Input

5
15 14 10 45 30
2 5 1 3 4
7

Sample Output
100

import java.io.*;
	import java.util.*;

	public class Main {

		public static int unboundedKnapsack(int[] val , int[] wt , int cap)
		{
			int[] dp= new int[cap+1];
			dp[0]=0;
			int n= val.length;

			for(int bag=1;bag<=cap ; bag++)
			{	
				int max=0;
				for(int i=0;i<n;i++)
				{
				if(wt[i]<=bag)
				{
					int remaining= bag-wt[i];
					int remainingVal= dp[remaining];
					int optimalVal= val[i]+ remainingVal;


					if(optimalVal > max)
					  max=optimalVal;
				}
				}
				dp[bag]=max;
			}
			return dp[cap];
		}

	    public static void main(String[] args) throws Exception {

			Scanner sc= new Scanner(System.in);
			int n= sc.nextInt();
			int[] val= new int[n];
			int[] wt= new int[n];

			for(int i=0;i<n;i++)
			{
				val[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				wt[i]=sc.nextInt();
			}

			int cap= sc.nextInt();

			int profit= unboundedKnapsack(val , wt , cap);
			System.out.println(profit);


	    }
	}
