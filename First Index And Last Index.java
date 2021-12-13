//Sample Input
15
1 5 10 15 22 33 33 33 33 33 40 42 55 66 77 
33

//Sample Output
5
9


import java.io.*;
import java.util.*;

public class Main{
public static int firstIndex(int[] arr,int x)
{
    int li=0;
    int ri=arr.length-1;
    int fi=-1;
    while(li<=ri)
    { 
        int mid =(li+ri)/2;
        if(arr[mid]==x)
        {
            ri=mid-1;
            fi=mid;
        }
        else if(arr[mid]>x)
        {
            ri=mid-1;
        }
        else{
            li=mid+1;
        }
    }
return fi;
}
public static int lastIndex(int[] arr,int x)
{
    int li=0;
    int ri=arr.length-1;
    int ei=-1;
    while(li<=ri)
    {
        int mid =(li+ri)/2;
        if(arr[mid]==x)
        {
            li=mid+1;
            ei=mid;
        }
        else if(arr[mid]<x)
        {
            li=mid+1;
        }
        else{
            ri=mid-1;
        }
    }
    return ei;
    
       
    
}
public static void main(String[] args) throws Exception {  
    Scanner scn =new Scanner(System.in);
    int n=scn.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    int x= scn.nextInt();
   int fi= firstIndex(arr,x);
    int ei =lastIndex(arr,x);
    
     System.out.println(fi);
     System.out.println(ei);
    }
}

