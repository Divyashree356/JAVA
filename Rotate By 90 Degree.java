//Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

//Sample Output
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14



import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn=new Scanner(System.in);
    public static void transpose(int[][] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int t=arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=t;
                
            }
        }
    }
    public static void reverse1D(int[] arr)
    {
        int li=0;
        int ri=arr.length-1;
        while(li<=ri){
            int t=arr[li];
            arr[li]=arr[ri];
            arr[ri]=t;
            
            li++;
            ri--;
        }
    }
    public static void reverse(int[][] arr)
    {
        for(int[] d:arr)
         reverse1D(d);
    }
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[][] arr= new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= scn.nextInt();
            }
        }
        transpose(arr);
        reverse(arr);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
