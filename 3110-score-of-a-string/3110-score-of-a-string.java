class Solution {
    public int scoreOfString(String s) {
        char[] chs=s.toCharArray();
        int n=chs.length;
        int ans=0;
        for(int i=0;i<n-1;i++){
            ans+=Math.abs(chs[i]-chs[i+1]);
        }
        return ans;
    }
}