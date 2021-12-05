//Sample Input
8
1
100

//Sample Output
77




import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int ans=0 , borrow=0 , sub=0 , pow=1;
       while(n2!=0)
       {
           sub= borrow + (n2%10) - (n1%10);
           n1/=10;
           n2/=10;
           if(sub<0){
               sub+=b;
               borrow=-1;
           }
           else{
               borrow=0;
           }
           ans+= sub*pow;
           pow=pow*10;
       }
       return ans;
   }
  
  }
