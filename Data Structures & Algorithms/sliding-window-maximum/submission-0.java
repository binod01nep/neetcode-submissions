class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int high=k-1;
        int low=0;
        int i=0;
        int j=0;
        while(high<n){
            pq.add(nums[i]);
            if(pq.size()==k){
                while(pq.size()>1){
                    pq.remove();
                }
                ans[j]=pq.remove();
                j++;
                high++;
                low++;
                i=low-1;
            }
            i++;
        }
        return ans;
    }
}