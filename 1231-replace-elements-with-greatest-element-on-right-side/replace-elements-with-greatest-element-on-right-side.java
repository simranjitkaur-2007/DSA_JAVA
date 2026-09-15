class Solution {
    public int[] replaceElements(int[] arr) {
          int n=arr.length;
        int[] ans=new int[n];
        int maxFromRight=arr[n-1];
        ans[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            
            ans[i]=maxFromRight;
            maxFromRight=Math.max(maxFromRight,arr[i]);
            
           
        }
        // int i=1;
        // while(i<n){
        //     ans[i]=Math.max(arr)
        // }
        return ans;
    }
}