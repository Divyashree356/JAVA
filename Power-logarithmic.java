
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int ans = power(x, n);
    System.out.println(ans);
  }

  public static int power(int x, int n) {
    if(n==0)
    return 1;
    
    int recAns= power(x,n/2);
    int ans=recAns*recAns;
    
    if(n%2!=0)
    ans*=x;
    
    return ans;
  }

}
