import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
           Scanner sc= new Scanner(System.in);
           int n= sc.nextInt();

           int[] arr= new int[n];
           for(int i=0;i<n;i++)
           {
               arr[i]=sc.nextInt();
           }

           int included=arr[0];
           int excluded=0;

           for(int i=1;i<n;i++)
           {
               int newInc= excluded+arr[i];
               int newExc= Math.max(included ,excluded);

               included= newInc;
               excluded= newExc;
           }

           System.out.println(Math.max(included , excluded));

    }
}
