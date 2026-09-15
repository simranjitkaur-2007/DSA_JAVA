class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        for(int m=0;m<k;m++)
            sum+=nums[m];
        long mx=sum;
        for(int i=k;i<n;i++)
        {
            sum+=(nums[i]-nums[i-k]);
            mx=Math.max(mx,sum);
        }
        return (double)mx/k;
        
    }

}