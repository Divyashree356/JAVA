/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int idx=0;
    public TreeNode bstFromPreorder(int[] postorder) {
    idx= postorder.length-1;
     return construct(preorder , Integer.MIN_VALUE , Integer.MAX_VALUE);   
    }
    private TreeNode construct(int[] post , int min , int max)
    {
        if(idx==post.length)
        return null;
        
        if(post[idx]>min && post[idx]<max)
        { 
            TreeNode node= new TreeNode();
            node.val=post[idx];
            idx--;

           node.right= construct(post , node.val , max);
           node.left= construct(post ,min, node.val );
           
            
            return node;
        }
        else
        {
            return null;
        } 
            
        
    }
}
