import java.io.*;
import java.util.*;

public class Main {
 

  private static boolean checkParenthesis(String str, Stack<Character> st)
  {
      for(int i=0;i<str.length();i++)
    {
      
       char ch= str.charAt(i);

       if((ch>='a' && ch<='z')|| ch=='-' || ch=='+' || ch=='/' || ch=='*')
         continue;

        if(ch=='(' || ch=='[' || ch=='{')
        {
            st.push(ch);
        }

        else{
            
        if(st.size()==0 && i==str.length()-1)
           return false;

        if(ch==')' && st.peek() != '(')
          return false;
        
        else if(ch=='}' && st.peek() != '{')
         return false;

        else if(ch==']' && st.peek() != '[')
         return false;
        
       
        else if((ch==')' && st.peek()=='(') || (ch=='}' && st.peek()=='{') ||(ch==']' && st.peek()=='[') ) 
          st.pop();
    }
    }
    
      return st.size()==0;

  }
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Stack<Character> st = new Stack<>();
    
    boolean ans=checkParenthesis(str, st);
    System.out.println(ans);
  }

}
