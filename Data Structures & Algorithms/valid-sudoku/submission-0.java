class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> hs = new HashSet<>();

       for(int i = 0; i< board.length; i++){
        for(int j = 0; j<board[i].length; j++){
            if(board[i][j] == '.')
                continue;
            if(!hs.add(board[i][j]+" in row "+i))
                return false;
            if(!hs.add(board[i][j]+" in col "+j))
                return false;
            if(!hs.add(board[i][j]+" in sub "+i/3+" and "+j/3))
                return false;
        }
       } 
       return true;
    }
}
