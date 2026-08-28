class Solution {
    static int lCS(int i,int j,int m,int n,String text1,String text2,int[][] dp){
        if(i==m||j==n) return 0;
        if((i<m&&j<n)&&text1.charAt(i)==text2.charAt(j)){
            // System.out.println(text1.charAt(i)+" "+text2.charAt(j));
            // System.out.println(text1.charAt(i)==text2.charAt(j));
            return 1+lCS(i+1,j+1,m,n,text1,text2,dp);
        }
        if(dp[i][j]!=-1) return dp[i][j];
        //take from text1;
        int choice1=lCS(i+1,j,m,n,text1,text2,dp);
        //take from text2
        int choice2=lCS(i,j+1,m,n,text1,text2,dp);
        return dp[i][j] = Math.max(choice1,choice2);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m][n];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return lCS(0,0,m,n,text1,text2,dp);
    }
}
