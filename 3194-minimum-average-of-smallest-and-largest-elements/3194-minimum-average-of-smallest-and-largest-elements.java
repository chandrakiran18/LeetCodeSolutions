class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        double ans=Integer.MAX_VALUE;
        while(i<j){
            double temp=nums[i]+nums[j];
            temp/=2;
            ans=Math.min(ans,temp);
            i++;
            j--;
        }
        return ans;
    }
}