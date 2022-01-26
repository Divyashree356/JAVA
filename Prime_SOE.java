//Using Sieve of Eratosthenes

Sample Input
6 
24
Sample Output
7
11
13
17
19
23

import java.util.*;

public class Main{
    public static void isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
         if(n%i==0)
         {
             return;
         }
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int low=sc.nextInt();
        int hi=sc.nextInt();
        for(int i=low;i<=hi;i++)
        {
            isPrime(i);
        }
    }
}
