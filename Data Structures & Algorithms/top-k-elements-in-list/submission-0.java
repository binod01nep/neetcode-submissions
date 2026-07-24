class Solution {
    class Pair implements Comparable<Pair>{
        int key;
        int freq;
        Pair(int key,int freq){
            this.key=key;
            this.freq=freq;
        }
        public int compareTo(Pair p){
            return this.freq-p.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            if(!map.containsKey(ele)) map.put(ele,1);
            else map.put(ele,map.get(ele)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(Integer key:map.keySet()){
            pq.add(new Pair(key,map.get(key)));
            if(pq.size()>k) pq.remove();
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            Pair top=pq.remove();
            ans[i]=top.key;
        }
        return ans;
    }
}
