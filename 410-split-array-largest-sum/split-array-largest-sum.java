class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(split(nums,mid)>k){
            low=mid+1;
            }
            else
            high=mid-1;
        }
        return low;
    }
    private int split(int[] nums,int partition){
        int n=nums.length;
        int number=1;
        int low=0;
        for(int i=0;i<n;i++){
            if(low+nums[i]<=partition)
            low+=nums[i];
            else{
                if(nums[i]>partition)
                return -1;

                number++;
                low=nums[i];
            }
        }
        return number;
    }
}