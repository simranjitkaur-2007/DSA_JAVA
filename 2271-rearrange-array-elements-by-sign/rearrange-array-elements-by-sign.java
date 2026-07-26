class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int sorted[] =new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                sorted[pos]=nums[i];
                pos+=2;

            }
            else{
                sorted[neg]=nums[i];
                neg+=2;
                }
                
            }
return sorted;
        }
    }
