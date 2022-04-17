import java.io.*;
import java.util.*;

public class Main{

private static boolean isOptr(char c)
{
    if(c=='+' || c=='-' || c=='*' || c=='/')
     return true;

    return false;
}
private static int precedenceCheck(char opr)
{
    if( opr=='+' || opr=='-')
       return 1;

    return 2;
}

private static int calculate(int v1 , int v2 , char c)
{
     if(c=='+')
     return v1 + v2;
    
     else if(c=='-')
     return v1-v2;
    
     else if(c=='*')
      return v1 * v2;

     else if(c=='/')
      return v1/v2;
    
   return 0;
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

     Stack<Character> operator= new Stack<>();
     Stack<Integer> operand= new Stack<>();

     for(int i=0;i<exp.length();i++)
     {
         char ch=exp.charAt(i);
         if(ch=='(')
         {
             operator.push(ch);
         }
         else if(ch>='0' && ch<='9')
         {
             operand.push(ch-'0');
         }
         else if(ch==')')
         {
          while(operator.peek()!='(')
          {
              char optr= operator.pop();
              int val2= operand.pop();
              int val1= operand.pop();
              int ans= calculate(val1 , val2 ,optr);
              operand.push(ans);
          }
          operator.pop();
         }
         else if(isOptr(ch))
         {
            while(operator.size()>0 && operator.peek() != '(' && precedenceCheck(ch) <= precedenceCheck(operator.peek()))
             {
                 char optr= operator.pop();
                 int v2= operand.pop();
                 int v1= operand.pop();

                int ans= calculate(v1 , v2 ,optr);
                operand.push(ans);
            }
            operator.push(ch);
         }
     }

     while(operator.size()>0)
        {
                char optr= operator.pop();
                 int v2= operand.pop();
                 int v1= operand.pop();
                 int ans= calculate(v1 , v2 ,optr);
                 operand.push(ans);

        }

        System.out.println(operand.peek());
    
 }
}
