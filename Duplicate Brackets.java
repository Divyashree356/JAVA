import java.io.*;
import java.util.*;

public class Main {

private static boolean getDuplicate(String str )
{
    // System.out.println("runninh");
    Stack<Character> st= new Stack<>();
        for(int i=0;i<str.length();i++)
    {
        char ch= str.charAt(i);
        if(ch != ')')
        {
            st.push(ch);
        }
        else
        {
            if(st.peek()=='(')
            {
                return true;
            }
             

            while(st.peek()!='(')
                {st.pop();}
            st.pop();
        //    System.out.println("runninh");
        }
    }
    return false;
}
public static void main(String []args)
{
    Scanner sc= new Scanner(System.in);
    String str= sc.nextLine();
    // Stack<Character> st= new Stack<>();
    boolean ans= getDuplicate(str);
    System.out.println(ans);
}

}
   
