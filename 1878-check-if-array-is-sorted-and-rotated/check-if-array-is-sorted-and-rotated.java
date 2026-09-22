class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int biggest=0;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]<nums[i])
            {
                biggest=i+1;
                break;
            }
        }
        System.out.println(biggest);
        if(biggest!=0)
        {
            rotate(nums,0,biggest-1);
            rotate(nums,biggest,n-1);
            rotate(nums,0,n-1);    
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1])
                return false;
        }
        return true;
    }
    private void rotate(int[] nums,int left,int right){
        while(right>left){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
        }
    }
}