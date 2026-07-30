class Solution {
    public int findNumbers(int[] nums) {
        int n =nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if((count(nums[i])) % 2==0){
                c++;
            }
        }
        return c;
    }


    private int count(int x){
        if(x==0)
        return 0;
        int digi=0;
            while(x>0){
            int a=x%10;
            digi++;
            x=x/10;
            }
return digi;
    }
}