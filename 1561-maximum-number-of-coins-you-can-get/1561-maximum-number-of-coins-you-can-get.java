class Solution {
    public int maxCoins(int[] piles) {
        int ans=0;
        Arrays.sort(piles);
        int n=piles.length;
        int noPile=n/3;
        for(int i=noPile;i<n;i+=2){
            ans+=piles[i];
        }
        return ans;
    }
}