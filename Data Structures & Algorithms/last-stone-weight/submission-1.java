class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            int x=pq.remove();
           // if(pq.size()==1) break;
            int y=pq.remove();
            int diff=Math.abs(x-y);
            pq.add(diff);
        }
        return pq.peek();
    }
}
