class Solution {
    public int numRookCaptures(char[][] board) {
        int kill=0;
        int n=board.length;
        int m=board[0].length;
        int eleI=-1;
        int eleJ=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='R'){
                    eleI=i;
                    eleJ=j;
                    break;
                }
            }
        }

        for(int i=eleI;i>=0;i--){
            if(board[i][eleJ]=='B')break;
            else if(board[i][eleJ]=='p'){
                kill++;
                break;
            }
        }
        for(int i=eleI;i<n;i++){
            if(board[i][eleJ]=='B')break;
            else if(board[i][eleJ]=='p'){
                kill++;
                break;
            }
        }
        for(int i=eleJ;i>=0;i--){
            if(board[eleI][i]=='B')break;
            else if(board[eleI][i]=='p'){
                kill++;
                break;
            }
        }
        for(int i=eleJ;i<m;i++){
            if(board[eleI][i]=='B')break;
            else if(board[eleI][i]=='p'){
                kill++;
                break;
            }
        }
        return kill;
    }
}