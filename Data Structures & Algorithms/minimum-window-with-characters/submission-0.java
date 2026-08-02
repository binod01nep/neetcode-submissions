class Solution {
    public static boolean isTrue(int[] arrayofS,int[] arrayofT){
        for(int i=0;i<arrayofS.length;i++){
            if(arrayofS[i]<arrayofT[i]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m<n) return "";
        int[] arrayofS=new int[256];
        int[] arrayofT=new int[256];
        for(int j=0;j<t.length();j++){
            arrayofT[t.charAt(j)]++;
        }
        int high=0;
        int low=0;
        int res=Integer.MAX_VALUE;
        int start=0;
        for(high=0;high<m;high++){
            arrayofS[s.charAt(high)]++;
            while(isTrue(arrayofS,arrayofT)){
                int leng=high-low+1;
                if(leng<res){
                    start=low;
                    res=leng;
                }
                arrayofS[s.charAt(low)]--;
                low++;
            }
        }
        if(res==Integer.MAX_VALUE) return "";
        int end=start+res;
        return s.substring(start,end);
    }
}