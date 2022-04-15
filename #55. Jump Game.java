class Solution {
    public boolean canJump(int[] nums) {
        
        int n= nums.length;
        boolean[] dp= new boolean[n];
        dp[n-1]=true;
        
        for(int src=n-2;src>=0;src--)
        {
            for(int jump=0; jump<=nums[src] && jump+src<n ;jump++)
            {
                if(dp[jump+src]==true)
                {
                    dp[src]=true;
                    break;
                }
            }
        }
        return dp[0];
        
    }
}



// public boolean canJump(int[] nums) {
        
//         boolean[] dp = new boolean[nums.length];
//         return checkJump(nums , 0 , nums.length-1 , dp);
//         }
    
//     private boolean checkJump(int[] nums , int src , int dest , boolean[] dp)
//     {
//         if(src==dest)
//             return dp[src]=true;
        
//         if(dp[src]!=false)
//             return dp[src];
        
//         for(int jump=1;jump<=nums[src] && jump+src<=dest;jump++)
//         {
//             checkJump(nums , src+jump , dest , dp);
//         }
//         return dp[nums.length-1];
//     }
