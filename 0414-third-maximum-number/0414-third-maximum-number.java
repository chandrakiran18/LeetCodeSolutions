class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int k=2;
        int ans=nums[n-1];
        for(int i=n-1;i>=0;i--){
            if(k==0){
                ans=nums[i];
                return ans;
            }
            k--;
            int prev=nums[i];
            while(i>0 && nums[i-1]==prev)i--;
        }
        return ans;
    }
}