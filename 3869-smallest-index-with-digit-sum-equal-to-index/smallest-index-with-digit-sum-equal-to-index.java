class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            int j=nums[i];
            while(j>0){
                int a=j%10;
                sum+=a;
                j=j/10;
            }
            if(sum==i)
            return i;
            
    }
    return -1;
    }
}