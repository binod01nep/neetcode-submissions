class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]>nums[nums.length-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
                ans=Math.min(ans,nums[mid]);
            }
        }
        return ans;
    }
}
