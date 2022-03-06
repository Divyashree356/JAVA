import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
	   Scanner sc= new Scanner(System.in);
     int n1 = sc.nextInt();
     int[] arrA = new int[n1];

     for(int i=0;i<n1;i++)
       arrA[i] = sc.nextInt(); 

     int n2 = sc.nextInt();
     int[] arrB= new int[n2];

     for(int i=0;i<n2;i++)
       arrB[i] = sc.nextInt(); 

    HashMap<Integer, Integer> hm= new HashMap<>();

    for(int ele: arrA)
     hm.put(ele , hm.getOrDefault(ele ,0)+1);

    for(int ele:arrB)
      if(hm.containsKey(ele) && hm.get(ele)>0)
      {
        System.out.println(ele);
        hm.put(ele , hm.get(ele)-1);
      }
    
  }

}
