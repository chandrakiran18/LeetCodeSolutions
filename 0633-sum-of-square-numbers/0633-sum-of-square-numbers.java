class Solution {
    public boolean judgeSquareSum(int c) {
        long r=(long)Math.sqrt(c);
        long l=0;
        while(l<=r){
            long sq=(r*r)+(l*l);
            if(sq==c)return true;
            if(sq>c)r--;
            else l++;
        }
        return false;
    }
}