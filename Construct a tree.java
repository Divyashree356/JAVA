import java.util.Stack;

import javax.xml.stream.events.StartDocument;

public class main {

    public static class pair{
        Node node;
        int state;

        pair(){}
        pair(Node node , int state)
        {
            this.node=node;
            this.state=state;
        }
    }
    public static class Node
    {
        int val;
        Node right;
        Node left;

        Node(){}
        Node(int val){
         this.val=val;       
        }
         Node(int val , Node left , Node right)
         {
            this.val=val;
            this.right=right;
            this.left=left;

         }
        }
private static void display(Node root)
{
    if(root==null)
     return;

     System.out.println("root value->" + root.val);
     display(root.left);
     display(root.right);
}
    public static void main(String[] args)
    {
        Integer[] arr ={50 , 25, 12 , null , null, 37 ,30 , null ,null ,null , 75 ,95 , null , 70 , null , null , 80 , null , null };
        Stack<pair> st= new Stack<>();
        Node root= new Node(arr[0]);
        pair rootPair= new pair(root , 1);
        st.push(rootPair);
        int idx=1;
        while(st.size()!=0)
        {
            pair peekPair= st.peek();
            if(peekPair.state==1)
            {
                if(arr[idx]!=null)
                {
                    Node leftChild= new Node(arr[idx]);
                    peekPair.node.left= leftChild;

                    st.push(new pair(leftChild, 1));

                }
                peekPair.state++;
                idx++;

            }
            else if(peekPair.state==2)
            {
            
                if(arr[idx]!=null)
                {
                    Node rightChild= new Node(arr[idx]);
                    peekPair.node.right= rightChild;

                    st.push(new pair(rightChild, 1));

                }
                peekPair.state++;
                idx++;
            }
            else{
                st.pop();
            }
        }
        display(root);
    }

}
