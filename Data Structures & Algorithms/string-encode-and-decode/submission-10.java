class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            if(str.isEmpty()){
                sb.append("0");
                sb.append("#");
                continue;
            }
            sb.append(str.length());
            sb.append("#");
            for(int i=0;i<str.length();i++){
                sb.append(str.charAt(i));
            }
            
        }
        return sb.toString();//5#Hello5#World
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))) {
                int val = i;
                while (str.charAt(i) != '#') {
                    i++;
                }
                int dig = Integer.parseInt(str.substring(val, i));
                i++;
                for (int j = 0; j < dig; j++) {
                    sb.append(str.charAt(i + j));
                }
                ans.add(sb.toString());
                sb.setLength(0);
                i = i + dig - 1;
            }
        }

        return ans;
    }
}
