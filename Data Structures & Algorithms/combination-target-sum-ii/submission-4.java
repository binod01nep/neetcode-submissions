class Solution {
    public void cS(int[] candidates,int idx,int n,List<List<Integer>> ans,List<Integer> diary,int target,int sum){
    if(sum==target){
        ans.add(new ArrayList<>(diary));
        return;
    }
    for(int i = idx; i < n; i++){
        if(i > idx && candidates[i] == candidates[i-1]){
            continue;
        }
        if(sum + candidates[i] > target){
            break;
        }
        diary.add(candidates[i]);
        cS(candidates, i+1, n, ans, diary,target, sum + candidates[i]);
        diary.remove(diary.size()-1);
    }
}
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> diary=new ArrayList<>();
        int idx=0;
        int sum=0;
        int n=candidates.length;
        Arrays.sort(candidates);
        cS(candidates,idx,n,ans,diary,target,sum);
        return ans;
    }
}
