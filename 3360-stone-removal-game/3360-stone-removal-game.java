class Solution {
    public boolean canAliceWin(int n) {
        int flag=0;
        int rem=10;
        while(n>=0){
            if(flag==0){
                if(n>=rem){
                    n-=rem;
                }else{
                    return false;
                }
                rem--;
                flag=1;
            }else{
                if(n>=rem){
                    n-=rem;
                }else{
                    return true;
                }
                rem--;
                flag=0;
            }
        }
        return true;
    }
}