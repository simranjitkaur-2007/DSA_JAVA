class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        // we will take n1 X n1 matrix bcoz we need to write a stopping update at index n;
        int[][] diff=new int[n+1][n+1];
        for(int[] query:queries){
        int r1=query[0];
        int c1=query[1];
        int r2=query[2];
        int c2=query[3];
        
       diff[r1][c1] +=1;//start of increment
       diff[r1][c2+1]-=1;//end of increment at at last column
       diff[r2+1][c1]-=1; //We use r2 + 1 to stop the update vertically just after the rectangle's last row.
       diff[r2+1][c2+1]+=1;//extended to stop the sum 
        }
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i>0)//we dont want to traverse the negative index
                diff[i][j]+=diff[i-1][j];
            if(j>0)
                 diff[i][j]+=diff[i][j-1];
            if(i>0 && j>0)//the middle element is counted twice hence we need to subtract it.
            diff[i][j]-=diff[i-1][j-1];
        }
       }
       int[][] ans=new int[n][n];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            ans[i][j]=diff[i][j];
        }
       }
       return ans;
    }
}