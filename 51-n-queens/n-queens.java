class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] row:board)
        Arrays.fill(row,'.');

        int[] leftrow=new int[n];
        int[] upperdiagonal=new int[2*n-1];
        int[] lowerdiagonal=new int[2*n-1];

        backtrack(0,board,ans,leftrow,upperdiagonal,lowerdiagonal,n);
        return ans;
    }
    private void backtrack(int col,char[][] board,List<List<String>> ans,int[] leftrow,int[] upperdiagonal,int[] lowerdiagonal,int n){

        //if all col has been filled
        if(col==n){
            List<String> solution=new ArrayList<>();
            for(char[] row:board)
                solution.add(new String(row));
            ans.add(solution);
            return;
        }

        for(int row=0;row<n;row++){
            int lower=row+col;
            int upper=n-1+col-row;

            //check if the row and both diagonals are free
            if(leftrow[row]==0 && lowerdiagonal[lower]==0 && upperdiagonal[upper]==0){

                board[row][col]='Q';
                leftrow[row]=1;
                lowerdiagonal[lower]=1;
                upperdiagonal[upper]=1;

                backtrack(col+1,board,ans,leftrow,upperdiagonal,lowerdiagonal,n);

                //release the row and diagonal
                board[row][col]='.';
                leftrow[row]=0;
                lowerdiagonal[lower]=0;
                upperdiagonal[upper]=0;
            }
        }

    }
}