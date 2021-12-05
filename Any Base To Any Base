// INPUT:
// NUMBER: 111001
// BASE1: 2
// BASE2: 3

// OUTPUT:2010

import java.util.*;
  
  public class Main{
  public static int decimalToBase(int n , int b)
  {
    int ans=0 , pow=1 , rem=0;
      while(n!=0){
          rem=n%b;
          n=n/b;
          
          ans+=rem*pow;
          pow=pow*10;
          
      }
      return ans;
  }
  public static int baseToDecimal(int n , int b)
  {
      int ans=0 , pow=1 , rem=0;
      while(n!=0){
          rem=n%10;
          n=n/10;
          
          ans+=rem*pow;
          pow=pow*b;
          
      }
      return ans;
  }
  public static void main(String[] args) 
  {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
      
      int dn = baseToDecimal(n ,  sourceBase);
      int bn = decimalToBase(dn,  destBase);
     
     
     System.out.println(bn);
   }   
  }
