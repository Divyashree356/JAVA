Sample Input

6

Sample Output
21

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();

    long oldZero =1;
    long oldOne =1;

    for(int i=2;i<=n;i++)
    {
        long newZero= oldOne;
        long newOne = oldZero+oldOne; 

        oldZero=newZero;
        oldOne= newOne;
    }

    System.out.println(oldZero+oldOne);
 }

}
