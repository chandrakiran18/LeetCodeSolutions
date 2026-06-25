class Solution {
    boolean check(int[][] mat,int i,int j){
        int n=mat.length;
        int m=mat[0].length;
        if(i>=0 && i<n && j>=0 && j<m)return true;
        return false;
    }
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] copy = new int[n][m];
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1,  0,  1,-1, 1,-1, 0, 1}; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                copy[i][j]=board[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(copy[i][j]==0){
                    int count=0;
                    for(int k=0;k<8;k++){
                        int ni=i+dx[k];
                        int nj=j+dy[k];
                        if(check(copy,ni,nj) && copy[ni][nj]==1){
                            count++;
                        }
                    }
                    if(count==3){
                      board[i][j]=1;  
                    }
                }
                if(copy[i][j]==1){
                    int count=0;
                    for(int k=0;k<8;k++){
                        int ni=i+dx[k];
                        int nj=j+dy[k];
                        if(check(copy,ni,nj) && copy[ni][nj]==1){
                            count++;
                        }
                    }
                    if(count<2){
                      board[i][j]=0;  
                    }else if(count>=2 && count<=3){
                        board[i][j]=1;
                    }else{
                        board[i][j]=0;
                    }
                }
            }
        }
    }
}