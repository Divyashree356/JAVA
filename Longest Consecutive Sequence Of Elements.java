import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr= new int[n];

     for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();

    HashMap<Integer , Boolean> hm= new HashMap<>();

    for(int ele: arr)
     hm.put(ele , true);

    for(int ele :arr)
    {
        if(hm.containsKey(ele-1))
        {
            hm.put(ele, false);
        }
    }

    int maxLen = 0;
    int startPoint=0;
    for(int ele :arr)
    {
        if(hm.get(ele)==true)
        {
            int tempLen =1;
            int tempStartingPoint =ele;
            while(hm.containsKey(tempLen+tempStartingPoint))
            {
                tempLen++;
            }

            if(maxLen <tempLen)
            {
                maxLen= tempLen;
                startPoint = tempStartingPoint;
            }
        }
    }

    for(int i=startPoint ; i<maxLen + startPoint ;i++)
    {
        System.out.println(i);
    }

 }

}
