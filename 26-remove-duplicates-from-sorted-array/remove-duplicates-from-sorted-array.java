class Solution {
    public int removeDuplicates(int[] nums) {
        int freq=1;
        for(int array=1;array<nums.length;array++){
            if(nums[array]!=nums[array-1]){
                nums[freq]=nums[array];
                freq++;
            }
        }
return freq;


            }
}
    
 