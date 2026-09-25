class Solution {
    public int fillCups(int[] amount) {
        int ans=0;
        Arrays.sort(amount);
        while(amount[2]!=0){
            if(amount[1]==0)break;
            ans++;
            amount[1]--;
            amount[2]--;
            Arrays.sort(amount);
        }
        ans+=amount[2];
        return ans;
    }
}