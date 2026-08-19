class Solution {
    static void gP(int n,int idx,List<String> ans,StringBuilder sb,int open,int close){
        if(open==n&&close==n){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            gP(n,idx,ans,sb.append("("),open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            gP(n,idx,ans,sb.append(")"),open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
       
        return;

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int idx=0;
        int open=0;
        int close=0;
        gP(n,idx,ans,sb,open,close);
        return ans;
    }
}
