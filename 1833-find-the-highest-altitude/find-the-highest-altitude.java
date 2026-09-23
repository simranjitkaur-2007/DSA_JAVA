class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] ans=new int[n+1];
      
        for(int i=0;i<n;i++){
            ans[i+1]=ans[i]+gain[i];
        }
        int maxi=0;
        for(int i=0;i<ans.length;i++)
        maxi=Math.max(maxi,ans[i]);
return maxi;
    }
}