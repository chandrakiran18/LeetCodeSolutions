class Solution {
    public long count(int[] nums,long target){
        long ans=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            long sum=(long)nums[i]+nums[j];
            if(sum <=target){
                ans+=j-i;
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums,(long)upper)-count(nums,(long)lower-1);
    }
}