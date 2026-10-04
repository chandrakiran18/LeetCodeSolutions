class Solution {
    public int minRotations(String s) {
        int point=0;
        int ans=0;
        for(char c:s.toCharArray()){
            int req=c-'0';
            int d=Math.abs(point-req);
            ans+=Math.min(d,10-d);
            point=req;
        }
        return ans;
    }
}