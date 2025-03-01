class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0;
        int bottom = m-1, right = n-1;
        List<Integer> result = new ArrayList<Integer>();
        while(top <= bottom && left <= right) {
            for(int i=left; i<=right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if(right >= left && bottom >= top) {
                for(int i=right; i>=left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(bottom >= top && right >= left) {
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}