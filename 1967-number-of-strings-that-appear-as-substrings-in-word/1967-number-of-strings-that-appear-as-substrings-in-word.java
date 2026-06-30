class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans=0;
        for(String s:patterns){
            int ind=word.indexOf(s);
            if(ind!=-1)ans++;
        }
        return ans;
    }
}