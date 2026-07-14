class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(String s:sentences){
            int x=s.split(" ").length;
            ans=Math.max(ans,x);
        }
        return ans;
    }
}