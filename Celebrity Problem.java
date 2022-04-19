import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);
        
    }

    public static void findCelebrity(int[][] arr) {

        Stack<Integer> st= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            st.push(i);
        }

        while(st.size()>=2)
        {
            int j=st.pop();
            int i=st.pop();

            if(arr[i][j]==1)
            {
                //i is not celebrity because i j ko jaanta h
                st.push(j);
            }
            else
            {
                st.push(i);
            }
        }

        int candidate= st.peek();
        boolean ans=true;
        for(int i=0;i<arr.length;i++)
        {
            if(i!=candidate && (arr[i][candidate]==0 || arr[candidate][i]==1 ))
              ans= false;
        }
         
         if(ans)
          System.out.println(candidate);
          else 
           System.out.println("none");
    }
}
