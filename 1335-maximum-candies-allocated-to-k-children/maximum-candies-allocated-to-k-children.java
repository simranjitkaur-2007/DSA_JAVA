class Solution {
    public int maximumCandies(int[] candies, long k) {

        int n=candies.length;
       long m=1;
       int result=0;
       long sum=0;
        for(int i=0;i<n;i++)
        sum=sum+candies[i];
        if(sum<k){
        return 0;
        }
        int low=1;
        int high=0;
        for(int i=0;i<n;i++)
        high=Math.max(high,candies[i]);
        while(low<=high){
            int mid=low+(high-low)/2;
            long res=division(candies,k,mid);
            if(res>=k){
                result=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
            return result;
    }
      
     private long division(int[] candies,long k,int candy ){
        long sum=0;
       
        int n=candies.length;
                    for(int i=0;i<n;i++){
                 sum=sum+candies[i]/candy;
               
            } 
        
        return sum;
    }
}
