class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] alpha=new char[26];
        for(int i=0;i<s.length();i++){
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]!=0) return false;
        }
        return true;
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
        //     else map.put(s.charAt(i),map.get(s.charAt(i))+1);
        // }
        // for(int i=0;i<t.length();i++){
        //     if(!map.containsKey(t.charAt(i))) return false;
        //     else map.put(t.charAt(i),map.get(t.charAt(i))-1);
        // }
        // for(Character ch:map.keySet()){
        //     if(map.get(ch)>0) return false;
        // }
        // return true;

    }
}
