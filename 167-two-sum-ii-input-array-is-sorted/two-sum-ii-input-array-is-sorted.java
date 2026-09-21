class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int n=numbers.length;
        int right=n-1;
        // int[] ans=new int[2];
        while(left<=right){
            int sum=numbers[left]+numbers[right];
            if(target==sum)
           break;
            else if(sum>target)
            right--;
            else
            left++;
        }
 return new int[]{left+1,right+1};
        
    }
}