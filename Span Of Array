//Sample Input
6
15
30
40
4
11
9

//Sample Output
36




import java.io.*;
import java.util.*;

public class Main{
   
   
 public static int span(int[] arr)
 {
     int minL=Integer.MAX_VALUE , maxL=Integer.MIN_VALUE ,i;
     for(i=0; i<arr.length;i++){
        
        maxL=Math.max(maxL , arr[i]);
         
        minL=Math.min(minL , arr[i]);
         
         
     }
     return maxL-minL;
      }
 public static void main(String[] args) throws Exception {
  Scanner scn =new Scanner(System.in);
   int n= scn.nextInt();
   int[] arr= new int[n];
   int i;
   for(i=0; i<n; i++){
       arr[i]=scn.nextInt();
   }
    int s = span(arr);
    System.out.println(s);
 }

}
