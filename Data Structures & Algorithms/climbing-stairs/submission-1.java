class Solution {
    static int find(int idx,int n,int[] dp){
        if(idx==n||idx==n-1) return 1;
        if(dp[idx]!=-1) return dp[idx];
        dp[idx]=find(idx+1,n,dp)+find(idx+2,n,dp);
        return dp[idx];
    }
    public int climbStairs(int n) {
        int idx=0;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=find(idx,n,dp);
        return ans;
    }
}
