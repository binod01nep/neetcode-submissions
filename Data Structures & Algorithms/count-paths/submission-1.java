class Solution {
    static int uP(int i,int j,int m,int n,int[][] dp){
        if(i==m-1&&j==n-1) return 1;
        if(i<0||i>m-1||j>n-1||j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j] = uP(i+1,j,m,n,dp)+uP(i,j+1,m,n,dp);
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return uP(0,0,m,n,dp);
    }
}
