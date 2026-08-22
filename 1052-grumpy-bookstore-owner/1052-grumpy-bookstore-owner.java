class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int gain=0;
        int maxgain=0;
        int time=0;
        int n=customers.length;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                time+=customers[i];
            }
        }
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                gain+=customers[i];
            }
        }
        maxgain=gain;
        for(int i=minutes;i<n;i++){
            if(grumpy[i]==1){
                gain+=customers[i];
            }
            if(grumpy[i-minutes]==1){
                gain-=customers[i-minutes];
            }
            maxgain=Math.max(maxgain,gain);
        }
        return time+maxgain;
    }
}