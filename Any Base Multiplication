//Sample Input
5
1220
31
//Sample Output
43320



import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }
 public static int getSum(int n1, int n2 , int b){
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
 public static int multiplydigit(int n , int digit , int base)
 {
     int ans=0 , pow=1 , carry=0 , prod=0;
     while(n!=0 || carry!=0)
     {
         prod= carry+ (n%10)*digit;
         n=n/10;
         
         carry =prod/base;
         prod%=base;
         
         ans+=prod*pow;
         pow=pow*10;
     }
     return ans;
 }
 public static int getProduct(int b, int n1, int n2){
     int ans=0 , pow=1; 
     while(n2!=0)
     {
         int digitmul = multiplydigit(n1,n2%10 , b);
         n2=n2/10;
         
         
         ans=getSum(ans, digitmul*pow, b);
         pow=pow*10;
     }
     return ans;
 }

}
