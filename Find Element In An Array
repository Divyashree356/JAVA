//Sample Input
6
15 30 40 4 11 9
40

//Sample Output
2

import java.io.*;
import java.util.*;

public class Main{

public static int linearSearch(int arr[], int item)
{
  for(int i=0;i<arr.length;i++){
      if(arr[i]==item)
      {
          return i;
      }
      
  }   
  return -1;
}
    
public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n =scn.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    int item;
    item=scn.nextInt();
   int ans=linearSearch(arr, item);
  System.out.println(ans);
 }

}
