class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=1;
        int high=(position[n-1]-position[0])/(m-1);
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPlace(position,mid,m)){
                ans=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return ans;
    }
    private boolean canPlace(int[] position,int force,int m){
        int n=position.length;
        int last=position[0];
        int c=1;
        for(int i=0;i<n;i++){
            if(position[i]-last>=force){
                c++;
                last=position[i];
            }
        if(c>=m)
            return true;
        }
        return false; 
    }
}