class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int ans=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        while(i<n){
            while(set.contains(nums[i])){
                set.remove(nums[j]);
                sum-=nums[j++];
            }
            set.add(nums[i]);
            sum+=nums[i++];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}