class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int j=0;
        int[] ans=new int[n];
        for(int i=1;i<n;i+=2){
            ans[j++]=nums[i];
            ans[j++]=nums[i-1];
        }
        return ans;
    }
}