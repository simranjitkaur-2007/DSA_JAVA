class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int currentMax=0;
        int currentMin=0;

        for(int i=0;i<n;i++){
        totalSum+=nums[i];
        currentMax+=nums[i];
        maxSum=Math.max(maxSum,currentMax);
        if(currentMax<0)
        currentMax=0;
        currentMin+=nums[i];
        minSum=Math.min(minSum,currentMin);
        if(currentMin>0)
            currentMin=0;
        }
if(maxSum<0)
return maxSum;

return maxSum=Math.max(maxSum,totalSum-minSum);
    }
}