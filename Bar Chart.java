//Sample Input
5
3
1
0
7
5

//Sample Output
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*




import java.io.*;
import java.util.*;

public class Main {
    
  public static Scanner scn = new Scanner(System.in);
  
  public static void barChart(int[] arr)
  {
    int maxn = -(int)1e9;  //imstead of Integer.MAX_VALUE
    for(int i=0;i<arr.length;i++){
    maxn= Math.max(maxn , arr[i]);
    }
    for(int h =maxn ;h>=1;h--)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>=h)
            {
                System.out.print("*\t");
            }
            else
             System.out.print("\t");
        }
        System.out.println();
    }
    
  }
  public static void main(String[] args) throws Exception {
    // write your code here
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++)
    {
      arr[i] = scn.nextInt();
    }
    barChart(arr);

  }

}
