import java.io.*;
import java.util.*;

public class Main{
  
private static int precedence(char c)
{
    if(c=='+' || c=='-')
     return 1;
    return 2;
}

private static boolean isOptr(char c)
{
    if(c=='+' || c=='*' || c=='/' || c=='-')
     return true;
    return false;
}
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<String> prefix= new Stack<>();
    Stack<String> postfix= new Stack<>();
    Stack<Character> operator= new Stack<>();

    for(int i=0;i<exp.length();i++)
    {
     char ch= exp.charAt(i);
     if(ch=='(')
     {
         operator.push(ch);
     }
     else if( (ch>='0' && ch<='9') || (ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
     {
        prefix.push(ch+"");
        postfix.push(ch+"");
     }

     else if(ch==')')
     {
         while(operator.peek()!='(')
         {
         String prev2= prefix.pop();
         String prev1= prefix.pop();
         String postv2=postfix.pop();
         String postv1=postfix.pop();

         char c=operator.pop();
         String prevAns = c+prev1+prev2;
         String postAns =postv1+postv2+c;

         prefix.push(prevAns);
         postfix.push(postAns);
        }
    operator.pop();
     }
     else if(isOptr(ch))
     {
         while(operator.size() != 0 && operator.peek() != '(' && precedence(operator.peek()) >= precedence(ch))
         {
         String prev2= prefix.pop();
         String prev1= prefix.pop();
         String postv2=postfix.pop();
         String postv1=postfix.pop();

         char c=operator.pop();

         String prevAns = c+prev1+prev2;
          String postAns =postv1+postv2+c;

         prefix.push(prevAns);
         postfix.push(postAns);
         }
         operator.push(ch);
     }
    }

    while(operator.size()!=0)
    {
         String prev2= prefix.pop();
         String prev1= prefix.pop();
         String postv2=postfix.pop();
         String postv1=postfix.pop();

         char c=operator.pop();
         String prevAns = c+prev1+prev2;
          String postAns =postv1+postv2+c;

         prefix.push(prevAns);
         postfix.push(postAns);
    }

    System.out.println(postfix.peek());
    System.out.println(prefix.peek());

 }
}
