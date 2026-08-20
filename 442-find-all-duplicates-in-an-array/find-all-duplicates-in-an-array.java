class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])
            dup.add(nums[i]);
        }
        return dup;
    }
}