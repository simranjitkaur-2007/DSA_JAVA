class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int topL=0;
        int bottomL=m-1;
        while(topL<n && bottomL>=0){
            if(matrix[bottomL][topL]==target)
            return true;
            else if(matrix[bottomL][topL]>target)
            bottomL--;
            else
            topL++;
        }
        return false;
    }
}