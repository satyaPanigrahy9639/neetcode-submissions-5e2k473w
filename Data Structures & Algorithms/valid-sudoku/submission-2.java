class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> hs = new HashSet<>();
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j< board[0].length; j++){
                if(board[i][j] == '.')
                    continue;
                if(!hs.add(board[i][j]+" in row "+i)
                || !hs.add(board[i][j]+" in column "+j)
                || !hs.add(board[i][j]+" in sub "+i/3+" and "+j/3))
                    return false;
            }
        }
        return true;
    }
}
