//INPUT:
// N1:8
//N2:777
//BASE :1

//OUTPUT:1000


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
         int ans=0 , pow=1 , carry =0 , sum=0;
         while(n1!=0 || n2!=0 || carry!=0)
         {
             sum= carry + n1%10 + n2%10;
             n1/=10;
             n2/=10;
             
             carry =sum/b;
             sum%=b;
             ans+=sum*pow;
             pow=pow*10;
         }
         return ans;
         
   }
  }
