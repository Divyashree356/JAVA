Example 1:


Input: m = 3, n = 7
Output: 28
Example 2:

Input: m = 3, n = 2
Output: 3
  
class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp= new int[m];
        Arrays.fill(dp , 1);
        
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                dp[j]=dp[j]+dp[j-1];
            }
        }
        
return dp[m-1];
    }
}
