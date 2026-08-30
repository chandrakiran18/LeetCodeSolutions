class Solution {
    public int minimumDeletions(int[] nums) {
        int big=Integer.MIN_VALUE;
        int sml=Integer.MAX_VALUE;
        int maxI=-1;
        int minI=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>big){
                big=nums[i];
                maxI=i;
            }
            if(nums[i]<sml){
                sml=nums[i];
                minI=i;
            }
        }
        int left=Math.min(minI,maxI);
        int right=Math.max(minI,maxI);
        return Math.min(Math.min(n-left,right+1),left+1+n-right);
    }
}