class Solution {
    static void p(int[] nums,int idx,int n,List<List<Integer>> ans,List<Integer> diary,boolean[] used){
        if(diary.size()==n){
            ans.add(new ArrayList<>(diary));
            return;
        }
        for(int i=0;i<n;i++){
            if(used[i]) continue;
            used[i]=true;
            diary.add(nums[i]);
            p(nums,i+1,n,ans,diary,used);
            diary.remove(diary.size()-1);
            used[i]=false;
        }
        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> diary=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        int idx=0;
        int n=nums.length;
        p(nums,idx,n,ans,diary,used);
        return ans;
    }
}
