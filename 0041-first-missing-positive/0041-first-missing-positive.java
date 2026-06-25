class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ans=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0)continue;
            if(ans!=nums[i]){
                if(ans>nums[i])continue;
                else return ans;
            }
            ans+=1;
        }
        return ans;
    }
}