class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int sum1=0;
        int sum2=0;
        int maxSum=0;
        int end=0;
        int minSum=0;
        for(int i=0;i<n;i++){
            sum1+=nums[i];
            maxSum=Math.max(maxSum,sum1);
            if(sum1<0)
            sum1=0;
            sum2+=nums[i];
            minSum=Math.min(minSum,sum2);
            if(sum2>0)
            sum2=0;
        }
return Math.max(maxSum, Math.abs(minSum));
        }
    
}