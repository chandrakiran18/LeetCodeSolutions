class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix=new int[nums.length+1];
        for(int i =0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=prefix[i+1];
        }
        return nums;
    }
}