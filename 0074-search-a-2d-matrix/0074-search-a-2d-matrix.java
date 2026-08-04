class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int f = 0;
        int e = n - 1;
        while (f <= e) {
            int i = f + (e - f) / 2;
            if (target < matrix[i][0]) {
                e = i - 1;
            } else if (target > matrix[i][m - 1]) {
                f = i + 1;
            } else {
                int l = 0;
                int r = m - 1;

                while (l <= r) {
                    int mid = l + (r - l) / 2;

                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (matrix[i][mid] > target) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}