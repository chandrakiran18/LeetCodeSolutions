class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int actualSum=nums[0];
        int a=0;
        int flag=0;
        for(int i=1;i<n;i++){
            actualSum+=nums[i];
            if(flag==0){
                if(nums[i-1]==nums[i]){
                    a=nums[i];
                    flag=1;
                }
            }
        }
        int exp=n*(n+1)/2;
        int b=exp-actualSum+a;
        return new int[]{a,b};
    }
}