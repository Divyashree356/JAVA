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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans= new ArrayList<>();
        
        TreeNode curr= root;
        while(curr!=null)
        {
            if(curr.left==null)
            {
                //print 
                ans.add(curr.val);
                //goto right
                curr=curr.right;
            }
            else
            {
                //if not visites inP.right is null
                
                TreeNode inPred= curr.left;
                while(inPred.right!=null && inPred.right!= curr)
                {
                    inPred= inPred.right;
                }
                
                if(inPred.right==null)
                {
                    inPred.right=curr;
                    curr=curr.left;
                }
                else
                {
                    inPred.right=null;
                    ans.add(curr.val);
                //goto right
                  curr=curr.right;
                }
                
                //add link and goto left
                //if visited by checking inP.right not null
                //remove link and print
            
            }
            
        }
        return ans;
            
    }
}
