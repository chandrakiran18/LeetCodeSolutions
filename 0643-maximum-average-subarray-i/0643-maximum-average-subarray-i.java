class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int[] prefix=new int[n+1];
        double ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=0;i<=n-k;i++){
            int max=prefix[i+k]-prefix[i];
            ans=Math.max(ans,max);
        }
        return ans/k;
    }
}