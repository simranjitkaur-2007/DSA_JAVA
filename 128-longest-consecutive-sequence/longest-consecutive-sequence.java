class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)
        return 0;
        Set<Integer> set= new HashSet<>();
        int longest=0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        } 
     for(int arr:set){
        if(!set.contains(arr-1)){
        int x=arr;
        int count=1; 
     
     while(set.contains(x+1)){
        x++;
        count++;
     }
     longest=Math.max(longest,count);
     }
     }
     return longest;
    }
}