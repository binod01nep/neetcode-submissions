class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a hash map for nums
        //iterate over that hash map and check if target-value is present or not
        //if present check wheter both key are same or not
        //if same continue
        //else return as ans
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int complement=target-nums[i];
        //     if(map.containsKey(complement)) return new int[]{map.get(complement),i};
        //     else map.put(nums[i],i);

        // }
        // return null;
        System.gc();
      for(int i=1;i<nums.length;i++){
          for(int j=i; j<nums.length;j++){
            if (nums[j] + nums[j-i] == target)
                return new int [] {j-i,j};
          }
      }
          return null;
        
    }
}
