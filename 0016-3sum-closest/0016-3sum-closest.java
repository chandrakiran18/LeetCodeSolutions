class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int diff=nums[0]+nums[1]+nums[2];
        int mindiff=Math.abs(diff-target);
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target)return target;
                else if(sum<target){
                    j++;
                }else{
                    k--;
                }
                int currdiff=Math.abs(sum-target);
                if(currdiff<mindiff){
                    mindiff=currdiff;
                    diff=sum;
                }
            }
        }
        return diff;
    }
}