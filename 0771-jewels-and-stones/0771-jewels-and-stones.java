class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] jewel=new boolean[128];
        int ans=0;
        for(char c:jewels.toCharArray()){
            jewel[c]=true;
        }
        for(char c:stones.toCharArray()){
            if(jewel[c])ans++;
        }
        return ans;
    }
}