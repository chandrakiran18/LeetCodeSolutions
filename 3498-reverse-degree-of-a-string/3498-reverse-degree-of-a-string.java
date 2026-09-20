class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int val=s.charAt(i)-'a';
            ans+=(26-val)*(i+1);
        }
        return ans;
    }
}