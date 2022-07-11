public static int getMaxSum(Node root)
{
        if(root.left!=null && root.right !=null)
        {
            int left= getMaxSum(root.left);
            int right= getMaxSum(root.right);

            int left_ = Math.max(0 , left);
            int right_ = Math.max(0 , right);

            return Math.max(left , right)+root.data;
        }
        else if(root.left!=null)
        {
            int left= getMaxSum(root.left);
            int left_ = Math.max(0 , left);

            return left_+ root.data;
        }
        else if(root.right!=null)
        {
            int right= getMaxSum(root.right);
            int right_ = Math.max(0 , right);

            return right_+root.data;
        }
        else
        {
            return root.data;
        }
}
