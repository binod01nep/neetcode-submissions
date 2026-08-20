class Solution {
    static void s(int[] nums,int idx,int n,List<List<Integer>> ans,List<Integer> diary){
        ans.add(new ArrayList<>(diary));
        for(int i=idx;i<n;i++){
            diary.add(nums[i]);
            s(nums,i+1,n,ans,diary);
            diary.remove(diary.size()-1);
        }
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> diary=new ArrayList<>();
        int idx=0;
        int n=nums.length;
        s(nums,idx,n,ans,diary);
        return ans;
    }
}
