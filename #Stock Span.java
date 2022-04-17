import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   
   int[] ans= new int[arr.length];
  //  Arrays.fill(ans, -1);
   Stack<Integer> st= new Stack<>();

   for(int i=arr.length-1;i>=0;i--)
   {
     while(st.size()!=0 && arr[i]>arr[st.peek()])
     {
       int idx= st.pop();
       ans[idx]=i;
     }
     st.push(i);
   }
   while(st.size()!=0)
   {
     int idx=st.pop();
     ans[idx]=-1;
   }
   for(int i=0;i<arr.length;i++)
   {
     arr[i]= i-ans[i];
   }
return arr;
 }

}
