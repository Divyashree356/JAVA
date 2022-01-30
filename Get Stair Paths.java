Sample Input
3
Sample Output
[111, 12, 21, 3]

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans=getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n)
    {
       
        if(n==0)
        {
        ArrayList<String> base=new ArrayList<>();
        base.add("");
        return base;
        }
        
        ArrayList<String> myAns=new ArrayList<>();
        
        if(n-1 >= 0)
        {
        ArrayList<String> nm1= getStairPaths(n-1);
        for(String ele: nm1)
            {
                myAns.add("1"+ele);
            }
        }
        
        if(n-2 >= 0)
        {
          ArrayList<String> nm2=getStairPaths(n-2);
            for(String ele: nm2)
            {
            myAns.add("2"+ele);
                
            }
        }
        
        if(n-3>=0)
        {
         ArrayList<String> nm3=getStairPaths(n-3);
            for(String ele: nm3)
             {
            myAns.add("3"+ele);
             }
        }
        
        return myAns;
        
    }

}
