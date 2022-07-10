// { Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}// } Driver Code Ends


class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {  
       return construct(0 , n-1 , 0 , n-1 ,inorder, preorder);
    }
    
    public static Node construct(int plo , int phi , int ilo , int ihi , int[] in ,int[]pre)
    {
        if(plo>phi || ilo>ihi)
        return null;
        
        Node node= new Node(pre[plo]);
        node.data=pre[plo];
        
        int idx=ilo;
        while(idx<=ihi)
        {
            if(in[idx]==pre[plo])
             break;
             
             idx++;
        }
        
        int leftNodes= idx-ilo;
        
        node.left=construct(plo+1 , plo+leftNodes ,ilo , idx-1 , in , pre);
        node.right= construct(plo+leftNodes+1 , phi , idx+1 , ihi , in, pre);
        
        return node;
    }
}
