class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int j=0;
        int x=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[j]=nums[i];
                j++;
            }
            else{
                ans[x]=nums[i];
                x--;
            }
        }
        return ans;
    }
}