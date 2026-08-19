class Solution {
    public void sD(int[] nums,int idx,int n,List<List<Integer>> ans,List<Integer> diary){
        ans.add(new ArrayList<>(diary));
        for(int i=idx;i<n;i++){
            if(i>idx&&nums[i]==nums[i-1]){
                continue;
            }
            diary.add(nums[i]);
            sD(nums,i+1,n,ans,diary);
            diary.remove(diary.size()-1);
        }
        return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int idx=0;
        List<Integer> diary=new ArrayList<>();
        sD(nums,idx,nums.length,ans,diary);
        return ans;
    }
}
