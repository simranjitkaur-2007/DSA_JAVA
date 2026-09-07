class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high=Integer.MIN_VALUE;
        int low=1;
        int n=nums.length;
        int result=high;
        for(int i=0;i<n;i++){
            high=Math.max(high,nums[i]);
        }
        while(high>=low){
            int mid=low+(high-low)/2;
            if(div(nums,mid,threshold)){
               result =mid;
               high=mid-1;
            }
            else
            low=mid+1; 
        }
        return result;

    }
    private boolean div(int[] nums,int deno,int threshold){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+ (int)Math.ceil((float)nums[i]/deno);

        }
        return sum<=threshold;
    }
}