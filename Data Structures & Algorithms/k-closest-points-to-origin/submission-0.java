class Solution {
    class Pair{
        int idx;
        int distance;
        Pair(int idx,int distance){
            this.idx=idx;
            this.distance=distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->Integer.compare(b.distance,a.distance)
        );
        for(int row=0;row<points.length;row++){
            int x=points[row][0];
            int y=points[row][1];
            int dis=x*x+y*y;
            pq.add(new Pair(row,dis));
            if(pq.size()>k) pq.remove();
        }
        int[][] ans=new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            ans[i++]=points[p.idx];

        }
        return ans;

    }
}
