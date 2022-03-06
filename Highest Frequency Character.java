import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            // if(hm.containsKey(str.charAt(i))==false)
            // {
            //     hm.put(str.charAt(i) , 1);
            // }
            // else
            //     hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            hm.put(ch , hm.getOrDefault(ch , 0)+1);
        }


        char max=str.charAt(0);
        for(char key : hm.keySet())
        {
            if(hm.get(key) >hm.get(max))
              max=key;
        }
        System.out.println(max);

    }

}
