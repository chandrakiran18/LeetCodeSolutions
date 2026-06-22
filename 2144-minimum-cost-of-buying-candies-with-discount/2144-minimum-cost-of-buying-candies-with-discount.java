class Solution {
    public int minimumCost(int[] cost) {
        int costed=0;
        int count=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            costed+=cost[i];
            count++;
            if(count==2){
                count=0;
                i--;
            }
        }
        return costed;
    }
}