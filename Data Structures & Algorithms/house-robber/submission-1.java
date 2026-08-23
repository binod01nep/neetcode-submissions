class Solution {
    static int maxAmt(int[] nums,int idx,int n,int free,int[][] dp){
        if(idx==n) return 0;
        if(dp[idx][free]!=-1) return dp[idx][free];
        if(free==0) return dp[idx][free]=maxAmt(nums,idx+1,n,1,dp);
        return dp[idx][free]=Math.max(nums[idx]+maxAmt(nums,idx+1,n,0,dp),maxAmt(nums,idx+1,n,1,dp));
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int idx=0;
        int[][] dp=new int[nums.length][2];
        for(int row=0;row<n;row++){
            dp[row][0]=-1;
            dp[row][1]=-1;
        }
        return maxAmt(nums,idx,n,1,dp);
    }
}
