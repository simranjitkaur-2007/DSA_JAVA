class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        int low=0;
        int high=-1;
        for(int i=0;i<n;i++){
        sum=sum+weights[i];
         low=Math.max(low,weights[i]);
        }
       high=Math.max(high,sum);
      
        
    while(low<high){
        int mid=low+(high-low)/2;
        int d=group(weights,mid);
        if(d<=days)
        high= mid;
        else
        low=mid+1;
    }
    return low;
}
    private int group(int[] weights,int capacity){
        int n=weights.length;
        int day=1;
        int load=0;
        for(int i=0;i<n;i++){
            if(load +weights[i]> capacity){
                day=day+1;
                load=weights[i];
            }
            else
        load+=weights[i];
        }
    return day;
    }
}
