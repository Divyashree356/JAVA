import java.io.*;
import java.util.*;

public class Main{
  
private static int calculate(int a , int b , char c)
{
    if(c=='+')
     return a+b;
    else if(c=='-')
     return a-b;
    else if(c=='*')
     return a*b;
    else if(c=='/')
     return a/b;

    return 0;

}  
private static boolean isOptr(char ch)
{
    if(ch=='+' || ch=='-' || ch=='/' || ch=='*')
      return true;
    return false;
}
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<Integer> solve= new Stack<>();
    Stack<String> postfix= new Stack<>();
    Stack<String> infix= new Stack<>(); 

    for(int i=exp.length()-1;i>=0;i--)
    {
        char ch= exp.charAt(i);
        if(ch>='0' && ch<='9')
        {
            solve.push(ch-'0');
            postfix.push(ch+"");
            infix.push(ch+"");
        }
        else if(isOptr(ch))
        {
            int val1= solve.pop();
            int val2= solve.pop();
            int ans= calculate(val1 , val2 , ch);

            solve.push(ans);
           
           String i1= infix.pop();
           String i2= infix.pop();
           String ansStr= '(' + i1 + ch+ i2 +')';
           infix.push(ansStr);

           String p1= postfix.pop();
           String p2= postfix.pop();

           postfix.push(p1+p2+ch);
        }

    }
    
        System.out.println(solve.peek());
        System.out.println(infix.peek());
        System.out.println(postfix.peek());
 }
}
