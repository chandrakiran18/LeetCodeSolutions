class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] result=new int[n];
        if(k==0)return result;
        int st;
        int end;
        if(k>0){
            st=1;
            end=k;
        }else{
            st=n+k;
            end=n-1;
        }
        int win=0;
        for(int i=st;i<=end;i++){
            win+=code[i];
        }
        for(int i=0;i<n;i++){
            result[i]=win;
            win-=code[st%n];
            win+=code[(end+1)%n];
            st++;
            end++;
        }
        return result;
    }
}