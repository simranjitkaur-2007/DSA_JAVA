class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        // assume we cannot compute the entire array product 
        // no zeroes: {1,2,3}
        // 1 zero: {1,0,2,3}
        // multiple zeroes {1,0,2,0,3}
        int prefix = 1;
        int suffix = 1; 
        vector<int> result(nums.size(), 1);
        // forward pass 
        for(int i = 0; i<nums.size()-1; i++){
            prefix *= nums[i];
            result[i+1] = prefix;

        }
        for(int i = nums.size() -1 ; i>= 1; i--){
            suffix *= nums[i];
            result[i-1] *= suffix;
        }

        return result;

        
    }
};