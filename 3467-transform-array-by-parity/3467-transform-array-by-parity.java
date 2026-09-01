class Solution {
    public int[] transformArray(int[] nums) {
        int x=0;
        int y=nums.length-1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[x++]=0;
            }else{
                ans[y--]=1;
            }
        }
        return ans;
    }
}