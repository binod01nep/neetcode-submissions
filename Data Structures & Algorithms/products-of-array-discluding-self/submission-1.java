class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int post=1;
        for(int i=0;i<nums.length;i++){
            if(i==0) ans[i]=1;
            else ans[i]=nums[i-1]*ans[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            
                post=post*nums[i+1];
                ans[i]=ans[i]*post;
            
        }
        return ans;
    }
}  
