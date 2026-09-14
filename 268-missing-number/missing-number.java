// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         int low=nums[0];
//         int high=nums[n-1];
//         while(low<=high){
//             int mid=low+(high-low)/2;
//             if(((nums[mid]+1)-nums[mid])!=1 || nums[mid]-(nums[mid]-1)!=1)
//             return mid;
//             else if(n/2>nums[mid])
//             high=mid-1;
//             else
//             low=mid+1;
//         }
//         return mid;
//     }
// }
 class Solution {
 public int missingNumber(int[] nums) {
    int n=nums.length;
    int xor=n;
    for(int i=0;i<n;i++)
    xor=xor^i^nums[i];
    return xor;
 }
 }