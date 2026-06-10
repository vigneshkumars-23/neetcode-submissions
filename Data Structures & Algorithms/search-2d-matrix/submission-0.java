class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][matrix[i].length - 1] >= target){
                int start = 0, end = matrix[i].length - 1;
                while(start <= end){
                    int mid = (start+end)/2;
                    if(matrix[i][mid] == target)
                        return true;
                    else if(matrix[i][mid] > target)
                        end = mid - 1;
                    else 
                        start = mid + 1;
                }
            }
        }
        return false;
    }
}
