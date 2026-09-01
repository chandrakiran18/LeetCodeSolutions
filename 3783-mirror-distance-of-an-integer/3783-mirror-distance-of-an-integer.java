class Solution {
    public int mirrorDistance(int n) {
        int x=n;
        int rev=0;
        while(x!=0){
            rev*=10;
            rev+=x%10;
            x/=10;
        }
        return Math.abs(n-rev);
    }
}