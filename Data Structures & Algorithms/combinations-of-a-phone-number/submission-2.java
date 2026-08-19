class Solution {
    public void lC(String digits,int idx,int n,HashMap<Character,String> map,List<String> ans,StringBuilder sb ){
        if(idx==n){
            ans.add(sb.toString());
            return;
        }
        //choice
        String choices=map.get(digits.charAt(idx));//abc
        for(int i=0;i<choices.length();i++){
            lC(digits,idx+1,n,map,ans,sb.append(choices.charAt(i)));
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        int idx=0;
        StringBuilder sb=new StringBuilder();
        int n=digits.length();
        lC(digits,idx,n,map,ans,sb);
        return ans;
        
    }
}
