import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrA = new int[n];
        for(int i=0;i<n;i++)
         arrA[i]=sc.nextInt();

        int n2=sc.nextInt();
        int[] arrB = new int[n2];
        for(int i=0;i<n2;i++)
          arrB[i]=sc.nextInt();

        HashMap<Integer , Integer> hm= new HashMap<>();

        for(int i=0;i<n;i++)
        {
            hm.put(arrA[i] ,hm.getOrDefault(arrA[i] , 0)+1);
        }

        for(int ele:arrB)
        {
            if(hm.containsKey(ele))
        {
            System.out.println(ele);
            hm.remove(ele);
            }
        }
      }

}
