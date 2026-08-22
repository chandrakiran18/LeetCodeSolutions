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
        return n%(sum+prod)==0;
    }
}