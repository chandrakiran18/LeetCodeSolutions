class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=1;
        int high=nums[n-1];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            for(int x:nums){
                if(x%mid==0){
                    sum+=x/mid;
                }else{
                    sum+=(x/mid)+1;
                }
            }
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}