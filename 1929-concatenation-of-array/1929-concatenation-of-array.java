class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n*2];
        int flag=0;
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[flag];
            flag=(flag+1)%n;
        }
        return ans;
    }
}