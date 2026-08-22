class Solution {
    private boolean count(int[] bloomDay,int day,int m, int k){
        int c=0;
        int n=bloomDay.length;
        int bouqet=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                c++;
                if(c==k){
                    bouqet++;
                    c=0;
                }
            }
            else
            c=0;
        }
        return bouqet>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int day=0;
       int high = Integer.MIN_VALUE;
       int low = Integer.MAX_VALUE;

    for(int i = 0; i < n; i++){
        high = Math.max(high, bloomDay[i]);
        low = Math.min(low, bloomDay[i]);
}
        int result=-1;
        long required = (long) m * k;
        if (required>n) 
        return -1;
        else{
        while(high>=low){
            int mid=low+(high-low)/2;
            if(count(bloomDay,mid,m,k)){
            result=mid;
            high=mid-1;
            }
            else 
            low=mid+1;
        }
        }
        return result;
}
}