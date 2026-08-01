class Solution {
    public int lengthOfLongestSubstring(String str) {
        HashMap<Character,Integer> map=new HashMap<>();//pw
        int high=0;
        int low=0;
        int ans=Integer.MIN_VALUE;
        if(str.length()==0) return 0;
        for(high=0;high<str.length();high++){
            char ch=str.charAt(high);
            if(!map.containsKey(ch)) map.put(ch,1);
            else{
                while(map.containsKey(ch)&&low<high){//1r1t7
                    ans=Math.max(ans,high-low);
                    low++;
                    map.remove(str.charAt(low-1));  
                }
                map.put(ch,1);
            }
            ans=Math.max(ans,high-low+1);
        }
        return ans;
    }
}
