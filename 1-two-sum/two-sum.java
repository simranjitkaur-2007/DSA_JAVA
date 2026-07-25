// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//        for(int i=0;i<n-1;i++){
//         for(int j=1;j<n;j++){
//             if(nums[i] + nums[j] == target && i!=j)
//            return new int[]{i, j};
//         }
//        }
//         return new int[]{};
//     }
// }


class Solution {
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int ans=target-nums[i];
        if(map.containsKey(ans)){
            return new int[] {map.get(ans),i};
        }
        map.put(nums[i],i);
    }
    return new int[] {-1,-1};
}
    }