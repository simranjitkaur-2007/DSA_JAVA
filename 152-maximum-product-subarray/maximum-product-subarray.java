class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxProd=nums[0];
        int minProd=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            int oldMax=maxProd;
            int oldMin=minProd;
            int curr=nums[i];
            maxProd=Math.max(curr,Math.max(oldMax*curr,oldMin*curr));
            minProd=Math.min(curr,Math.min(oldMax*curr,oldMin*curr));
            ans=Math.max(maxProd,ans);
        }
        return ans;
    }
}