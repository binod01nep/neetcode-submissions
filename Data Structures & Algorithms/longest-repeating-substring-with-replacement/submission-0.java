class Solution {
    static int max(int[] ch){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(ch[i]>ans) ans=Math.max(ans,ch[i]);
        }
        return ans;
    }
    public int characterReplacement(String s, int k) {
        int[] ch=new int[26];
        int high=0;
        int low=0;
        int ans=Integer.MIN_VALUE;
        int leng=0;
        for(high=0;high<s.length();high++){
            ch[s.charAt(high)-'A']++;
            leng=high-low+1;
            int maxCount=max(ch);
            int diff=leng-maxCount;
            while(diff>k){
                ch[s.charAt(low)-'A']--;
                low++;
                maxCount=max(ch);
                leng=high-low+1;
                diff=leng-maxCount;
            }
            ans=Math.max(ans,leng);
        }
        return ans;
    }
}