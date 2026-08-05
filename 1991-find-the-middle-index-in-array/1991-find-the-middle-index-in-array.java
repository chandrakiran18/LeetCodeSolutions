class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        int lSum=0;
        for(int i=0;i<n;i++){
            int rSum=sum-lSum-nums[i];
            if(lSum==rSum)return i;
            lSum+=nums[i];
        }
        return -1;
    }
}