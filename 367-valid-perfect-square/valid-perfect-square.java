class Solution {
    public boolean isPerfectSquare(int num) {
        long low=0;
        long high=num;
        while(high>=low){
            long mid=low+(high-low)/2;
            long sq=mid*mid;
            if(sq==num)
            return true;
            else if(sq>num)
            high=mid-1;
            else
            low=mid+1;
        }
        return false;
    }
}