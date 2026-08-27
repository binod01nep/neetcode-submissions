class Solution {
    static int fTS(int[] nums,int idx,int target,int[][] dp){
        if(idx==nums.length){
            if(target==0) return 1;
            else return 0;
        }
        if(dp[idx][target]!=-1) return dp[idx][target];
        int choice1=0;
        if(nums[idx]<=target) choice1=fTS(nums,idx+1,target-nums[idx],dp);
        int choice2=fTS(nums,idx+1,target,dp);
        return dp[idx][target] = choice1+choice2;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int num:nums) sum+=num;
        int newTarget=(sum+target)/2;
        if((sum+target)%2!=0||Math.abs(target)>sum) return 0;
        int[][] dp=new int[nums.length][newTarget+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return fTS(nums,0,newTarget,dp);
    }
}
