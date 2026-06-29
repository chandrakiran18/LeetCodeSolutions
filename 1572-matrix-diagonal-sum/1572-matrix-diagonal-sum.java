class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=mat[i][i];
            if(n%2!=0){
                if(i==n/2)continue;
            }
            ans+=mat[i][n-1-i];
        }
        return ans;
    }
}