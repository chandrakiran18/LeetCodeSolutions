class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int[] prefix=new int[n+1];
        double ans=Integer.MIN_VALUE;
        int max=0;
        prefix[0]=0;
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=0;i<=n-k;i++){
            int j=i+k;
            max=prefix[j]-prefix[i];
            ans=Math.max(ans,max);
        }
        return ans/k;
    }
}