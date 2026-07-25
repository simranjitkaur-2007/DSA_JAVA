class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> major=new HashMap<>();
       int n=nums.length;
       int count=0;
       for(int arr:nums){
       count=major.getOrDefault(arr,0)+1;
       major.put(arr,count);
       if(count>n/2)
       return arr;
       }
       return 0;
    }
}