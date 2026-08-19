class Solution {
    public void cS(int[] nums,int idx,int n,int sum,int target,List<List<Integer>> ans,List<Integer> diary){
        if(idx==n){
             if(sum==target){
                ans.add(new ArrayList<>(diary));
            }
            return;
        }
       
        //not to take
        cS(nums,idx+1,n,sum,target,ans,diary);
        //take
        if(nums[idx]+sum<=target){
            diary.add(nums[idx]);
            sum=sum+nums[idx];
            cS(nums,idx,n,sum,target,ans,diary);
            diary.remove(diary.size()-1);
            sum=sum-nums[idx];
        }
        return;
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int sum=0;
        int n=nums.length;
        int idx=0;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> diary=new ArrayList<>();
        cS(nums,idx,n,sum,target,ans,diary);
        return ans;
    }
}
