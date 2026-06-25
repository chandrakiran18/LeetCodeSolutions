class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=n-2;i>=0;i-=2){
            ans+=nums[i];
        }
        return ans;
    }
}