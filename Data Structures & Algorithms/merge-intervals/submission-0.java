class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> res=new ArrayList<>();
        int low1=arr[0][0];
        int high1=arr[0][1];
        for(int i=1;i<arr.length;i++){
            int low2=arr[i][0];
            int high2=arr[i][1];
            if(high1>=low2){
                //merge
                low1=low1;
                high1=Math.max(high1,high2);
                continue;
            }
            res.add(new int[]{low1,high1});
            low1=low2;
            high1=high2;
        }
        res.add(new int[]{low1,high1});
        return res.toArray(new int[res.size()][2]);
    }
}
