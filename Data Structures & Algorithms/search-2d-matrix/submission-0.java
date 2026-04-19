class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length-1;
        int l =0;
        for(int i = 0; i< matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][n]){
                    l = i;
                    break;
            }
        }
        int j = 0;
        while (j <= n){
            int mid = (j+n)/2;
            if(matrix[l][mid] == target)
                return true;
            else if(matrix[l][mid] > target)
                n = mid - 1;
            else
                j = mid+1;
        }
        return false;
    }
}
