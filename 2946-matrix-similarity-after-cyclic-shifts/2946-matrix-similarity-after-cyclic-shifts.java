class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] dup=new int[n][m];
        k%=m;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dup[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int x=0;x<k;x++){
                    int temp=mat[i][0];
                    for(int j=1;j<m;j++){
                        mat[i][j-1]=mat[i][j];
                    }
                    mat[i][m-1]=temp;  
                }
            }else{
                for(int x=0;x<k;x++){
                    int temp=mat[i][m-1];
                    for(int j=m-1;j>0;j--){
                        mat[i][j]=mat[i][j-1];
                    }
                    mat[i][0]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dup[i][j]!=mat[i][j])return false;
            }
        }
        return true;
    }
}