class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int high=nums[k-1];
        int low=nums[0];
        int ans=high-low;
        for(int i=k;i<n;i++){
            high=nums[i];
            low=nums[i-k+1];
            ans=Math.min(ans,high-low);
        }
        return ans;
    }
}