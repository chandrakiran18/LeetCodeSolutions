class Solution {
    public boolean checkDivisibility(int n) {
        String s=String.valueOf(n);
        int sum=0;
        int prod=1;
        for(char c:s.toCharArray()){
            int x=c-'0';
            sum+=x;
            prod*=x;
        }
        int fin=sum+prod;
        if(n%fin==0)return true;
        return false;
    }
}