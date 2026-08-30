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
        int ans=0;
        int a=Math.max(maxI+1,minI+1);
        int b=Math.max(n-maxI,n-minI);
        int c=maxI+1+n-minI;
        int d=minI+1+n-maxI;
        return Math.min(Math.min(a,b),Math.min(c,d));
    }
}