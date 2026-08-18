// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int i=0;
//         int n=nums.length;
//       int[] ans=new int[n];
    
 
//         while(i<n){
//             int prod=1;
//             for(int j=0;j<n;j++){
//                 if(i==j){
//                 continue;
//                 }
//                 else{
//                 prod=prod*nums[j];             
//                 }
//             }
//             ans[i]=prod;
//                 i++;           
//         }
//         return ans;
//     }
// }


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int left=1;
        for (int i=0;i<n;i++) {
            ans[i]=left;
            left*=nums[i];
        }
       
        int right=1;
        for (int i=n-1;i>=0;i--) {
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
    }
}