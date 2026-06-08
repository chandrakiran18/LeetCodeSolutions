class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxsum=0;
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            maxsum=Math.max(maxsum,sum);
            i++;
            j--;
        }
        return maxsum;
    }
}