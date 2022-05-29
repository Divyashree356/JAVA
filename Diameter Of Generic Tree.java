import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }
  
  public static int dia=0;
  public static int getDiameter(Node root)
  {
    int lh=-1;
    int slh=-1;

    for(Node child: root.children)
    {
      int ch= getDiameter(child);
      if(ch>lh)
        {
          slh=lh;
          lh=ch;
        }
      else if(ch>slh)
      {
        slh=ch;
      }

      if(lh+slh+2>dia)
         dia=slh+lh+2;

    }
    
      return lh+1;
  }
  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    dia=0;
    getDiameter(root);
    System.out.println(dia);
  }

}
