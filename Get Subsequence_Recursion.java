Sample Input
abc

Sample Output
[, c, b, bc, a, ac, ab, abc]

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> ans=gss(s);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
         {
             ArrayList<String> base =new ArrayList<>();
             base.add("");
             return base;
         }
         char ch=str.charAt(0);
         String subs= str.substring(1);
         
         ArrayList<String> recAns= gss(subs);
         ArrayList<String> myAns = new ArrayList<>();
         
        for(String ele:recAns)
        {
            myAns.add(ele);
        }
         
         for(String ele :recAns)
         {
             myAns.add(ch+ele);
         }
         

         return myAns;
    }

}
