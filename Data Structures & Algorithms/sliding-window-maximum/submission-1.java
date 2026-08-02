class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();//make it decreasing monotonic queue
        int j=0;
        for(int i=0;i<n;i++){
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty()&&nums[i]>nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                ans[j]=nums[dq.peekFirst()];
                j++;
            }
        }
        return ans;
    }
}