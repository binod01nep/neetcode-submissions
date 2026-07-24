class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       String[] decoded=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            int[] ch=new int[26];
            for(int j=0;j<strs[i].length();j++){
                char c=strs[i].charAt(j);
                ch[c-'a']++;
            }
            String s=Arrays.toString(ch);
            decoded[i]=s;
        }
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            if(map.containsKey(decoded[i])) map.get(decoded[i]).add(strs[i]);
            else {
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(decoded[i],list);
            }
        }

        List<List<String>> l=new ArrayList<>();
        for(String st: map.keySet()){
            l.add(map.get(st));
        }

        return l;


    }
}