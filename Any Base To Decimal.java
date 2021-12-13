// INPUT:
// Number:111001
// Base: 2

// OUTPUT:
// 57


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int ans=0 , pow=1 , re=0;
      while(n!=0){
          re = n%10;
          n=n/10;
          
          ans+=re*pow;
          pow=pow*b;
      }
      return ans;
   }

  }
  
  
