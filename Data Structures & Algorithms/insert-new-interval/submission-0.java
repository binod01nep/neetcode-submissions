class Solution {
    public int[][] insert(int[][] arr, int[] interval) {
        List<int[]> res=new ArrayList<>();
        List<int[]> ans=new ArrayList<>();
        boolean isInserted=false;
        for(int i=0;i<arr.length;i++){
            if(isInserted==false&&arr[i][0]>=interval[0]){
                res.add(interval);
                isInserted=true;
            }
            res.add(new int[]{arr[i][0],arr[i][1]});
        }
        if(isInserted==false) res.add(interval);
        if(res.isEmpty()) return new int[][]{{interval[0],interval[1]}};
        int low1=res.get(0)[0];
        int high1=res.get(0)[1];
        for(int i=1;i<res.size();i++){
            int low2=res.get(i)[0];
            int high2=res.get(i)[1];
            if(high1>=low2){
                low1=low1;
                high1=Math.max(high1,high2);
                continue;
            }
            ans.add(new int[]{low1,high1});
            low1=low2;
            high1=high2;
        }
        ans.add(new int[]{low1,high1});
        return ans.toArray(new int[ans.size()][2]);
    }
}
