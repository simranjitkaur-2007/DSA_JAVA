//reverse integer and it should be a 32 bit int else return 0
class Solution {
    public int reverse(int x) {
        int rev=0;
       while(x != 0) {
       int a=x%10;
       //since the range of 32 bit integer is Integer.MAX_VALUE = 2147483647
//Integer.MIN_VALUE = -2147483648
        if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE && rev>7)){
            return 0;
        }
        else if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE && rev<-8)){
            return 0;
        }
        rev=rev*10 + a;
        x=x/10;
    }
    return rev;
}
}
