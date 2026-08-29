class Solution {
    static int mP(int idx,int n,int[] prices,int k,int[][] dp){
        if(idx==n||k==0) return 0;
        if(dp[idx][k]!=-1) return dp[idx][k];
        if(k==2){
            //buy
            int choice1=mP(idx+1,n,prices,k-1,dp)-prices[idx];
            int choice2=mP(idx+1,n,prices,k,dp);
            return dp[idx][k]= Math.max(choice1,choice2);
        }
        else //sell
        return dp[idx][k]= Math.max(mP(idx+1,n,prices,k-1,dp)+prices[idx],mP(idx+1,n,prices,k,dp));
    }
    public int maxProfit(int[] prices) {
        int k=2;
        int idx=0;
        int n=prices.length;
        int[][] dp=new int[n][k+1];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        return mP(idx,n,prices,k,dp);
    }
}
