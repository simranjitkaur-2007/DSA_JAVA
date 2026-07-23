class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int def_max=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
            count++;
             def_max=Math.max(def_max,count);
        }
        else{
            count=0;
        }
        }
        return def_max;
    }
}