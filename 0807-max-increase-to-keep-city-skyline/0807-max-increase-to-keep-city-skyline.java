class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x=grid[i][j];
                int rm=0;
                int clm=0;
                for(int k=0;k<n;k++){
                    if(grid[k][j]>rm){
                        rm=grid[k][j];
                    }
                }
                for(int k=0;k<m;k++){
                    if(grid[i][k]>clm){
                        clm=grid[i][k];
                    }
                }
                int y=Math.min(rm,clm);
                ans+=y-x;
            }
        }
        return ans;
    }
}