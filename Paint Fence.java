import java.io.*;
import java.util.*;

public class Main {
    public static int ways(int n , int k)
    {
        int xxWays=k;
        int xyWays= k*(k-1);

        for (int i=3;i<=n;i++)
        {
            int newxx= xyWays;
            int newxy = (xxWays+xyWays)*(k-1);

            xxWays= newxx;
            xyWays= newxy;
        }
    return xyWays+xxWays;
    }
    public static void main(String[] args) throws Exception {
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();

     int ans =ways(n ,k);
        System.out.println(ans);
    }
}
